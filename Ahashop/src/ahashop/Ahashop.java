package ahashop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ahashop {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.ClientDriver"); 
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shop","app","app");
        Statement statement = con.createStatement();
//        statement.executeUpdate("INSERT INTO PRODUCT values (23,'MNM',7)");
//        statement.executeUpdate("UPDATE PRODUCT SET PRICE =5 WHERE PRODUCT_ID=23");
//        statement.executeUpdate("insert into orders values (51,'PROCESSING')");
//        statement.executeUpdate("insert into order_item values (51,9,1,100)");
//        statement.executeUpdate("insert into order_item values (51,23,5,5)");
//        ResultSet rs = statement.executeQuery("select * from order_item where order_id=51");
//        while(rs.next()) {
//            System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)+"  "+rs.getDouble(4));
//        }
        String sql = "select ORDER_ITEM.ORDER_ID, PRODUCT.PRODUCT_NAME,ORDER_ITEM.QUANTITY,ORDER_ITEM.PRODUCT_PRICE,ORDER_ITEM.QUANTITY*ORDER_ITEM.PRODUCT_PRICE as total,ORDERS.STATUS\n" +
"from ORDER_ITEM " +
"join PRODUCT on ORDER_ITEM.product_id=PRODUCT.PRODUCT_ID " +
"join ORDERS on ORDER_ITEM.ORDER_ID=orders.ORDER_ID " +
"where ORDER_ITEM.ORDER_ID=51 ";
        ResultSet rs = statement.executeQuery(sql);
        int i=0;
        System.out.println(" Product name \t Quantity Price/unit Total price");
        double total=0;
        while(rs.next()) {
            i++;
            System.out.println(i+" "+rs.getString("product_name")+"  "+rs.getInt("quantity")+" "+rs.getDouble("product_price")+"  "+rs.getDouble("total"));
            total += rs.getDouble("total");
        }
        System.out.println("Total price: "+total);
        con.close();
    }
    
    
    
}
