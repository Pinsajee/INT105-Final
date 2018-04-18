package ahashopg.pkg4;

import dbconnection.DbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Product {

    private int product_id;
    private String product_name;
    private double price;

    public Product(int product_id, String product_name, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

    private Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int updateProduct() throws ClassNotFoundException, SQLException {
        int resultUpdate = 0;
        
        Connection connect = DbConnection.getConnection();

//        Statement statement = connect.createStatement();
//        
//        ResultSet result = statement.executeQuery("SELECT * FROM product WHERE product_id = " + this.product_id);
//
//        if (result.next()) {
//            statement.executeUpdate("UPDATE product SET product_name = '" + this.product_name + "' , price = " + this.price + " WHERE product id = " + this.product_id);
//        } else {
//            statement.executeUpdate("INSERT INTO product VALUES ("+ this.product_id + ", '" + this.product_name + "' , " + this.price + ")");
//        }
        
        PreparedStatement statement = connect.prepareStatement("SELECT * FROM product WHERE product_id = ?");
        
        statement.setInt(1, this.product_id);
        
        ResultSet result = statement.executeQuery();

        if (result.next()) {
            statement = connect.prepareStatement("UPDATE product SET product_name = ? , price = ? WHERE product_id = ?");
            statement.setString(1, this.product_name);
            statement.setDouble(2, this.price);
            statement.setInt(3, this.product_id);
            statement.executeUpdate();
        } else {
            statement = connect.prepareStatement("INSERT INTO product VALUES product_id = ? , product_name = ? , price = ?");
            statement.setInt(1, product_id);
            statement.setString(2, product_name);
            statement.setDouble(3, price);
            statement.executeUpdate();
//            statement.executeUpdate("INSERT INTO product VALUES ("+ this.product_id + ", '" + this.product_name + "' , " + this.price + ")");
        }
        

        connect.close();
        return resultUpdate;
    }
    
    public static void orm(ResultSet result , Product product) throws SQLException {
        product.setProduct_id(result.getInt("product_id"));
        product.setProduct_name(result.getString("product_name"));
        product.setPrice(result.getDouble("price"));
    }

    public static Product findProductById(int id) throws ClassNotFoundException, SQLException {
        Product product = null;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection connecttion = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shopG4", "app", "app");

        Statement statement = connecttion.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM product WHERE product_id = " + id);

        if (result.next()) {
            product = new Product();
            orm(result , product);
        }

        connecttion.close();

        return product;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + '}';
    }

}
