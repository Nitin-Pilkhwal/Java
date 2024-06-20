package WrapperClass;

public class Wrapper {
    public static void main(String[] args) {
        // Example 1: Converting primitive types to wrapper objects
        int num1 = 10;
        Integer wrapperNum1 = Integer.valueOf(num1); // Converting int to Integer

        double num2 = 3.14;
        Double wrapperNum2 = Double.valueOf(num2); // Converting double to Double

        char letter = 'A';
        Character wrapperLetter = Character.valueOf(letter); // Converting char to Character

        // Example 2: Converting wrapper objects to primitive types
        Integer wrapperNum3 = Integer.valueOf(20);
        int num3 = wrapperNum3.intValue(); // Converting Integer to int

        Double wrapperNum4 = Double.valueOf(5.5);
        double num4 = wrapperNum4.doubleValue(); // Converting Double to double

        Character wrapperLetter2 = Character.valueOf('B');
        char letter2 = wrapperLetter2.charValue(); // Converting Character to char

        // Example 3: Autoboxing and Unboxing
        Integer wrapperNum5 = 30; // Autoboxing: Converting int to Integer
        int num5 = wrapperNum5; // Unboxing: Converting Integer to int

        Double wrapperNum6 = 2.5; // Autoboxing: Converting double to Double
        double num6 = wrapperNum6; // Unboxing: Converting Double to double

        Character wrapperLetter3 = 'C'; // Autoboxing: Converting char to Character
        char letter3 = wrapperLetter3; // Unboxing: Converting Character to char

        // Example 4: Wrapper class methods
        Integer wrapperNum7 = Integer.valueOf(40);
        System.out.println("Binary representation: " + Integer.toBinaryString(wrapperNum7));

        Double wrapperNum8 = Double.valueOf(7.7);
        System.out.println("Hexadecimal representation: " + Double.toHexString(wrapperNum8));

        Character wrapperLetter4 = Character.valueOf('D');
        System.out.println("Uppercase letter: " + Character.toUpperCase(wrapperLetter4));
    }
}
