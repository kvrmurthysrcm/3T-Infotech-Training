package session2;

/*
 * 
 * Properties of Enum in Java
There are certain properties followed by Enum as mentioned below:

Class Type: Every enum is internally implemented using the Class type.
Enum Constants: Each enum constant represents an object of type enum.
Switch Statements: Enum types can be used in switch statements.
Implicit Modifiers: Every enum constant is implicitly public static final.
 Since it is static, it can be accessed using the enum name. Since it is final, enums cannot be extended.
Main Method: Enums can declare a main() method, allowing direct invocation from the command line.

 */
public enum Colour {
    RED,
    GREEN,
    BLUE;
}
