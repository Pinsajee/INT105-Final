package fileio_data_object;

import java.io.*;

public class ObjectFile {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Product product1 = new Product(1, "Mouse", 150);
        
        File f = new File("ObjectFile.dat");
        ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(f));
        objOut.writeObject(product1);
        objOut.close();
        
        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(f));
        System.out.println(objIn.readObject());
        System.out.println(objIn.readObject());
        objIn.close();
    
    }
}
