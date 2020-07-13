package ExceptionHandling;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            int divideZero = 5 / 2;
            System.out.println("Inside try block");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block is always executed");
        }

        System.out.println("Outside try block");
    }
}
