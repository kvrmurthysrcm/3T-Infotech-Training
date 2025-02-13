package session2;

public class TestEnumColour {

	public static void main(String[] args) {
		 Colour c1 = Colour.RED;
        System.out.println("Printing specific Enum value:" + c1);

        for (Colour var_1 : Colour.values()) {
            System.out.println("Enum value = " + var_1);
        }
	}

}
