package ExceptionHandling;

public class ArraOutofBoundExample {

    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 2;
            System.out.println(divideByZero);


            int[] listOfNumbers = {5};
            int a = listOfNumbers[7];
            System.out.println("Run if no error");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutofBound Error : "+e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error : "+e.getMessage());

        } catch (Exception e) {
            System.out.println("Error : "+e.getMessage());
        }


        System.out.println("after catch block");
    }
}
