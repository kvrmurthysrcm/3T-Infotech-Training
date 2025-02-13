package session2;

public class TestEnumVariable {
    enum Color {
        RED,
        GREEN,
        BLUE;
    }

    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println("Printing Enum variable value: " + c1);
    }
}
