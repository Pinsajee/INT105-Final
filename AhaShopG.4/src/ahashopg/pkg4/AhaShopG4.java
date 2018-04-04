package ahashopg.pkg4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AhaShopG4 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shopG4", "app", "app");

        Statement state = connect.createStatement();

//        state.executeUpdate("INSERT INTO product VALUES (24,'Watch',200)");
//        state.executeUpdate("UPDATE product SET price=2000 WHERE product_id=24");
//        ResultSet result = state.executeQuery("SELECT * FROM order_item");
//        System.out.println("Order id\tProduct id\tQuantity\tPrice");
//        while(result.next()) {
//            System.out.println(result.getInt(1) + "\t\t" + result.getInt(2) + "\t\t" + result.getInt(3) + "\t\t" + result.getDouble(4));
//        }
        
//        ResultSet result1 = state.executeQuery("SELECT order_item.ORDER_ID, product.PRODUCT_NAME,order_item.QUANTITY,order_item.PRODUCT_PRICE, (order_item.QUANTITY * ORDER_ITEM.PRODUCT_PRICE) as total, orders.STATUS " +
//"FROM order_item " +
//"JOIN product ON order_item.PRODUCT_ID=product.PRODUCT_ID" +
//"JOIN orders ON order_item.ORDER_ID=orders.ORDER_ID" +
//"WHERE order_item.ORDER_ID=51");
  ResultSet result1 = state.executeQuery("SELECT order_item.ORDER_ID, product.PRODUCT_NAME,order_item.QUANTITY,order_item.PRODUCT_PRICE, (order_item.QUANTITY * ORDER_ITEM.PRODUCT_PRICE) as total, orders.STATUS\n" +
"FROM order_item \n" +
"JOIN product ON order_item.PRODUCT_ID=product.PRODUCT_ID\n" +
"JOIN orders ON order_item.ORDER_ID=orders.ORDER_ID\n" +
"WHERE order_item.ORDER_ID=51");

        System.out.println("Order id\tProduct Name\tQuantity\t\tPrice\t\tTotal\t\tStatus");
        while(result1.next()) {
            System.out.println(result1.getInt(1) + "\t\t" + result1.getString(2) + "\t\t" + result1.getInt(3) + "\t\t" + result1.getDouble(4) + "\t\t" + result1.getDouble(5) + "\t\t" + result1.getString(6));
        }
        connect.close();
    }

}
