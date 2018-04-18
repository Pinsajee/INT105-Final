package ahashopg.pkg4;

import java.sql.Connection;
import java.sql.DriverManager;
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
    
    public static Product findProductById(int id) throws ClassNotFoundException, SQLException {
        Product product = null;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection connecttion = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shopG4", "app", "app");

        Statement statement = connecttion.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM product WHERE product_id = " + id);
        
        if(result.next()) {
            product = new Product(result.getInt("product_id"), result.getString("product_name"), result.getDouble("price"));
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
