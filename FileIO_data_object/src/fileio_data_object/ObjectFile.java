package fileio_data_object;

import java.io.*;

public class ObjectFile {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Product product1 = new Product(1, "Mouse", 150);
        
        File f = new File("ObjectFile.dat");
        ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(f));
        objOut.writeObject(product1);
        objOut.close();
        
                
        File f2 = new File("ObjectFileAppend.dat");
        ObjectOutputStream objOutAppend = null;
        if(f2.exists()) {
            objOutAppend = new AppenedObjectOutputStream (new FileOutputStream(f2 , true));
        } else {
            objOutAppend = new ObjectOutputStream(new FileOutputStream(f2));
        }
        objOutAppend.writeObject(product1);
        objOutAppend.close();
        
         
        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(f2));
        System.out.println(objIn.readObject());
        System.out.println(objIn.readObject());
        objIn.close();

        
        
    
    }
}
