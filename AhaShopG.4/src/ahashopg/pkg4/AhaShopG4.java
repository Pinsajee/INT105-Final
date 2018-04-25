package ahashopg.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AhaShopG4 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
//        Class.forName("org.apache.derby.jdbc.ClientDriver");
//        Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shopG4", "app", "app");
//
//        Statement state = connect.createStatement();
//
////        state.executeUpdate("INSERT INTO product VALUES (24,'Watch',200)");
////        state.executeUpdate("UPDATE product SET price=2000 WHERE product_id=24");
////        ResultSet result = state.executeQuery("SELECT * FROM order_item");
////        System.out.println("Order id\tProduct id\tQuantity\tPrice");
////        while(result.next()) {
////            System.out.println(result.getInt(1) + "\t\t" + result.getInt(2) + "\t\t" + result.getInt(3) + "\t\t" + result.getDouble(4));
////        }
//        ResultSet result1 = state.executeQuery("SELECT order_item.ORDER_ID, product.PRODUCT_NAME,order_item.QUANTITY,order_item.PRODUCT_PRICE, (order_item.QUANTITY * ORDER_ITEM.PRODUCT_PRICE) as total, orders.STATUS\n"
//                + "FROM order_item \n"
//                + "JOIN product ON order_item.PRODUCT_ID=product.PRODUCT_ID\n"
//                + "JOIN orders ON order_item.ORDER_ID=orders.ORDER_ID\n"
//                + "WHERE order_item.ORDER_ID=51");
//
//        System.out.println("Order id\tProduct Name\tQuantity\t\tPrice\t\tTotal\t\tStatus");
//        double total = 0;
//
//        while (result1.next()) {
//            total += result1.getDouble("total");
//            System.out.println(result1.getInt(1) + "\t\t" + result1.getString(2) + "\t\t" + result1.getInt(3) + "\t\t" + result1.getDouble(4) + "\t\t" + result1.getDouble(5) + "\t\t" + result1.getString(6));
//        }
//        System.out.println("Total Price = " + total);
//        connect.close();
//        Class.forName("org.apache.derby.jdbc.ClientDriver");
//        Connection connecttion = DriverManager.getConnection("jdbc:derby://localhost:1527/aha_shopG4", "app", "app");
//
//        Statement statement = connecttion.createStatement();
//        ResultSet result = statement.executeQuery("SELECT * FROM product");
//        ProductOld product;
//        while (result.next()) {
//            product = new ProductOld(result.getInt("product_id"), result.getString("product_name"), result.getDouble("price"));
//            System.out.println(product.toString());
//        }
//
//        connecttion.close();

//        ProductOld findProductByID = ProductOld.findProductById(20);
//        System.out.println(findProductByID.toString());
//            ProductOld newProduct = ProductOld.findProductById(300);
//            newProduct.setPrice(50);
//            newProduct.updateProduct();
//            ProductAgain product01 = ProductAgain.findById(5);
//            System.out.println(product01);
//        String[] str_arr = new String[2];
//        str_arr[0] = "Hello World!";
//        str_arr[1] = "Java Programming";
//        System.out.println("Size of str_arr: " + str_arr.length);
//
//        for (int i = 0; i < str_arr.length; i++) {
//            System.out.println(str_arr[i]);
//        }
//
//        System.out.println("-------------------------------------------");
//
//        ArrayList<String> str_arr_list = new ArrayList<String>();
//        str_arr_list.add("Hello World!");
//        str_arr_list.add("Java Programming");
//        str_arr_list.add("Anything");
//        str_arr_list.remove(1);
//        System.out.println("Size of str_arr_list: " + str_arr_list.size());
//
//        for (int i = 0; i < str_arr_list.size(); i++) {
//            System.out.println(str_arr_list.get(i));
//        }
//        
//        System.out.println("-------------------------------------------");
////
//        Product product01 = new Product(200 , "Mouse" , 50);
//        Product product02 = new Product(201 , "Pen" , 5);
//        
//        ArrayList<Product> productArrayList = new ArrayList<Product>();
//        productArrayList.add(product01);
//        productArrayList.add(product02);
//        productArrayList.add(new Product(202 , "Keyboard" , 3));
//        productArrayList.add(new Product(203 , "Monitor" , 200));
//        
//        for (int i = 0; i < productArrayList.size(); i++) {
//            System.out.println(productArrayList.get(i).toString());
//          productArrayList.get(i).updateProduct();
//        }
        
    //file reader
    
//    File f = new File("file/product.csv");
//        FileReader fr = null;
//        try {
//            fr = new FileReader(f);
//            int ch;
//            while ((ch = fr.read()) != -1) {
//                System.out.print((char) ch);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());;
//        } finally {
//            try {
//                fr.close();
//            } catch (IOException ex) {
//
//            }
//        }
        // file reader 2
//        File f = new File("file/product.csv");
//        Scanner scan = new Scanner(f);
//        scan.useDelimiter(",");
//        while(scan.hasNext()) {
//            System.out.println(scan.next());
//        }
//        scan.close();
        Product prod = new Product();
        File f = new File("file/product.csv");
        Scanner scan = new Scanner(f);
        //scan.useDelimiter(",");
        while(scan.hasNext()) {
            String temp = scan.nextLine();
            String[] temp2 = temp.split(",");
            
            prod.setProduct_id(Integer.parseInt(temp2[0]));
            prod.setProduct_name(temp2[1]);
            prod.setPrice(Double.parseDouble(temp2[2]));
            System.out.println(prod);
        }
        scan.close();
    }

}
