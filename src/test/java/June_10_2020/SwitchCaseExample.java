package June_10_2020;

public class SwitchCaseExample {
    public static void main(String[] args) {
        int i = 7;
        switch (i) {
            case 7:
                System.out.println("7");
                break;
            case 2:
                System.out.println("2 OR 1");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("Did not match any case");
        }
    }
}
