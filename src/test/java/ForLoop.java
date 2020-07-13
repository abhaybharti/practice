public class ForLoop {

    public static void main(String[] args) {
        int num;
        for (num = 10; num >= 0; num--) {

            if (num == 5) {
                break;
            }
            System.out.println("value of number is " + num);
        }
        System.out.println("bMOT executeefore");
    }
}
