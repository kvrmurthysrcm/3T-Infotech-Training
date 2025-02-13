package session17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(
	        String[] args) throws IOException
	    {

	        FileInputStream sourceStream = null;
	        FileOutputStream targetStream = null;

	        try {
	            sourceStream
	                = new FileInputStream("C:\\common\\eclipse\\eclipse-workspace\\My3Tech-Training\\src\\session17\\sorcefile.txt");
	            targetStream
	                = new FileOutputStream("C:\\common\\eclipse\\eclipse-workspace\\My3Tech-Training\\src\\session17\\targetfile.txt");

	            // targetStream.write(1);
	            
	            // Reading source file and writing
	            // content to target file byte by byte
	            int temp;
	            while (( temp = sourceStream.read()) != -1) {
	                targetStream.write((byte)temp);
	            }
	        }
	        finally {
	            if (sourceStream != null)
	                sourceStream.close();
	            if (targetStream != null)
	                targetStream.close();
	        }
	    }
}
