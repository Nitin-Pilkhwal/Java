package Exception_Handling;

public class Runtime {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
        }
        // handling the exception
        //1. ArithmeticException
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
        //2. NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); // throws NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        //3. User-defined exception
        class MyException extends Exception {
            public MyException(String message) {
                super(message);
            }
        }
        try {
            System.out.println("Hello");
            throw new MyException("This is a user-defined exception");
        } catch (MyException e) {
            System.out.println("Hii");
            System.out.println(e.getMessage());
        }
    }
}