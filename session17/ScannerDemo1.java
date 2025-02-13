package session17;

/*
 * To create an object of Scanner class, we usually pass the predefined object System.in,
 *  which represents the standard input stream. We may pass an object of class File if we want to read input from a file.
To read numerical values of a certain data type XYZ, the function to use is nextXYZ(). 
For example, to read a value of type short, we can use nextShort()
To read strings, we use nextLine().
To read a single character, we use next().charAt(0). 
next() function returns the next token/word in the input as a string and charAt(0) function returns the first character
 in that string.
The Scanner class reads an entire line and divides the line into tokens. 
Tokens are small elements that have some meaning to the Java compiler. 
For example, Suppose there is an input string: How are you
In this case, the scanner object will read the entire line and divides the string into tokens: “How”, “are” and “you”. 
The object then iterates over each token and reads each token using its different methods.
///////////////////////////////////////////////////////////////////////////////////////////////
BufferedReader is more suitable for reading files with long String, 
while Scanner is more suitable for reading small user input from command prompt. 
BufferedReader is synchronized, while Scanner is not, which means you cannot share Scanner among multiple threads.

Scanner is the class in the java.util package that breaks the input into tokens using the delimiter pattern which by default matches the whitespace. The Scanner class can parse the primitive types and strings using the regular expressions.

Key Points:

It can reads and parses the input simultaneously.
It can provides the inbuilt methods for the parsing different data types. example like nextInt(), nextDouble().
It is convenient for the reading and parsing the input in the single step but is slower due to overhead of the parsing.

 */
//Java program to read data of various types 
//using Scanner class.
import java.util.Scanner;

//Driver Class
public class ScannerDemo1 {
   // main function
 public static void main(String[] args)
 {
     // Declare the object and initialize with
     // predefined standard input object
     Scanner sc = new Scanner(System.in);
     System.out.println("Pls enter name: ");
     // String input
     String name = sc.nextLine();
     System.out.println("Pls enter Gender: ");
     // Character input
     char gender = sc.next().charAt(0);

     // Numerical data input
     // byte, short and float can be read
     // using similar-named functions.
     System.out.println("Pls enter Age: ");
     int age = sc.nextInt();
     System.out.println("Pls enter Phone: ");
     long mobileNo = sc.nextLong();
     System.out.println("Pls enter CGPA: ");
     double cgpa = sc.nextDouble();

     // Print the values to check if the input was
     // correctly obtained.
     System.out.println("Name: " + name);
     System.out.println("Gender: " + gender);
     System.out.println("Age: " + age);
     System.out.println("Mobile Number: " + mobileNo);
     System.out.println("CGPA: " + cgpa);
     // System.exit(0);
 }
}
