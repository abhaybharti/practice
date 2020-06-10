package June_10_2020;

public class IfExampleWithlogicalOperator {
    public static void main(String[] args) {

        boolean b1 = false;
        boolean b2 = false;

        if (!b1 && !b2) {
            System.out.println("b1 && b2 : True");
        } else if (b1 || b2) {
            System.out.println("b1 || b2 : True");
        } else if (!b1) {
            System.out.println("!b1 : False");
        }
    }
}
