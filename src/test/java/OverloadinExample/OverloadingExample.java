package OverloadinExample;

public class OverloadingExample {

    public void addTwoNumber(int x, int y){
        System.out.println("Result : "+(x+y));
    }

    public void addTwoNumber(double x, double y){
        System.out.println("Result : "+(x+y));
    }

    public void addTwoNumber(int x, double y){
        System.out.println("Result : "+(x+y));
    }

    public void addTwoNumber(double x, int y) {
        System.out.println("Result : " + (x + y));
    }

    public void display(){
        System.out.println("Hello");
    }

    public void display(String firstName){
        System.out.println(firstName);
    }

    public void display(int age){
        System.out.println(age);
    }

    public void display(String firstName, String secondName){
        System.out.println(firstName+ " " +secondName);
    }


    public void display(String firstName, String secondName, String title){
        System.out.println(title+ " "+firstName+ " "+secondName);
    }

    public static void main(String[] args) {
         OverloadingExample o = new OverloadingExample();
        /* o.addTwoNumber(5,6);
         o.addTwoNumber(5.5,6.1);
         o.addTwoNumber(5,6.1);
         o.addTwoNumber(5.5,8);*/

        o.display();
        o.display(20);
        o.display("ABC");
        o.display("ABC", "XYZ");
        o.display("ABC", "XYXZ", "Mr.");
    }
}
