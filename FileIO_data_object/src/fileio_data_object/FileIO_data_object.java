package fileio_data_object;

import java.io.*;

public class FileIO_data_object {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("DataFile.dat");

        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(f, true));
        dataOut.writeLong(60130500109L);
        dataOut.writeUTF("Name: Daneas Losifirst");
        dataOut.writeUTF("E-mail: dlosifirst@hogwarts.magic");
        dataOut.writeInt(2000);
        dataOut.close();

        DataInputStream dataIn = new DataInputStream(new FileInputStream(f));
        while (dataIn.available() > 0) {
            System.out.println("--------------------");
            System.out.println(dataIn.readLong());
            System.out.println(dataIn.readUTF());
            System.out.println(dataIn.readUTF());
            System.out.println("Age: " + (2018 - dataIn.readInt()));

        }
        dataIn.close();

    }

}
