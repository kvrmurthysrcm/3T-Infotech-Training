package session3;

/*
 * Bitwise Operators are used to perform the manipulation of individual bits of a number and with any of the integer types. 
 * They are used when performing update and query operations of the Binary indexed trees. 
 * 
 */
public class TestBitWiseOperators {

	public static void main(String[] args)
    {
        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;
      
        // & (Bitwise AND) – returns bit-by-bit AND of input values.
        System.out.println("d & e : " + (d & e));
        
        // | (Bitwise OR) – returns bit-by-bit OR of input values.
        System.out.println("d | e : " + (d | e));
        
        // ^ (Bitwise XOR) – returns bit-by-bit XOR of input values.
        System.out.println("d ^ e : " + (d ^ e));
        
        // ~ (Bitwise Complement) – inverts all bits (one’s complement).
        System.out.println("~d : " + (~d));
        
        // << (Left shift) – Shifts bits left, filling 0s (multiplies by a power of two).
        System.out.println("d << 2 : " + (d << 2));
        
        // >> (Signed right shift) – Shifts bits right, filling 0s (divides by a power of two), with the leftmost bit depending on the sign.
        System.out.println("e >> 1 : " + (e >> 1));
        
        // >>> (Unsigned right shift) – Shifts bits right, filling 0s, with the leftmost bit always 0.
        System.out.println("e >>> 1 : " + (e >>> 1));
    }
}
