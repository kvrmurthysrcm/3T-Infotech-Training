package session17;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	
	public static void main(String[] args) throws IOException
    {
        FileReader sourceStream = null;
        
          try {
            sourceStream = new FileReader("C:\\\\common\\\\eclipse\\\\eclipse-workspace\\\\My3Tech-Training\\\\src\\\\session17\\\\sorcefile.txt");

            // Reading sourcefile and
            // writing content to target file
            // character by character.
            int temp;
          
            while (( temp = sourceStream.read())!= -1 ) {
                System.out.print((char)temp);
            }
        }
        finally {
          
            // Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}
