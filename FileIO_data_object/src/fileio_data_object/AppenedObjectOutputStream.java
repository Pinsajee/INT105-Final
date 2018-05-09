package fileio_data_object;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppenedObjectOutputStream extends ObjectOutputStream {

    public AppenedObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
       reset();
    }
    
    
    
}
