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
        ResultSet result = state.executeQuery("SELECT * FROM order_item");
        while(result.next()) {
            System.out.println(result.getInt(1));
        }
        connect.close();
    }

}
