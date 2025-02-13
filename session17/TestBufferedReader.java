package session17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * We use BufferedReader when performance is important, especially for efficiently reading large volumes of data or files. 
 * BufferedReader reads large chunks of data at once, making it ideal for reading from files or processing large amounts of input.
Example: The below Java program demonstrates reading user input from the console

BufferReader is the class in the java.io package that reads the text from the character-input stream, 
buffering characters to provide the efficient reading of the characters, arrays and lines. 
The BufferReader class does not parse the input data and making it faster for the simple read operations.

Key Points:

It can reads as the raw characters or strings.
It does not provide the parsing capabilities.
It can suitable for the reading large chunks of data efficiently.

 */
public class TestBufferedReader {
	
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader r = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = r.readLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(r.readLine());

        System.out.println("Name: " + name
                           + ", Age: " + age);
    }
}
