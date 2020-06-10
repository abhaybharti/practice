package June_10_2020;

public class BreakExample {
    public static void main(String[] args) {

        //(initialization; condition ; increment/decrement)
        for (int i =1; i <= 10; i++){
            if (i == 3){
                System.out.println("Before continue");
                continue; //skip current iteration
            }

            System.out.println(i);
            if (i == 5) {
                break; //Exit from loop
            }
        }

    }
}
