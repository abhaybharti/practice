package June_7_2020;

public class ForLoopExample {
    public static void main(String[] args) {

        //(initialization; condition ; increment/decrement)
        for (int i =1; i <= 10; i++){
            System.out.println(i);
        }

        for (int i =10; i >= 1; i--){
            System.out.println(i);
            for (int j = 1; j <5; j++){
                System.out.println("inner loop  : "+j);
            }
        }

        //To Do
        //1. for loop with condition
        //2. Enhanced for loop for operatio on array
    }
}
