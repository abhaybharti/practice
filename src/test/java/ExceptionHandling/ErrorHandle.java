package ExceptionHandling;

public class ErrorHandle {

    public static void main(String[] args) {
        System.out.println("Start division");
        try {
            System.out.println("Inside Try block");
            int divideByZero = 5 / 0;
            System.out.println(divideByZero);
            System.out.println("Try block completed");

        } catch (Exception e) {
            System.out.println("Error : "+e.getMessage()+e);
        }
        System.out.println("Successfully divided");

    }
}

