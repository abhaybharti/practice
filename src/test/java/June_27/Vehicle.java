package June_27;


//Define a class
public class Vehicle {

    String color;
    int wheel;
    boolean brake;
    int manufacturingYear = 100;
    boolean isEngineOn;

    //default constructor
    public Vehicle(){
        System.out.println("Inside default constructor");
    }

    //Constructor
    public Vehicle(String color,int wheel,boolean brake,int manufacturingYear, boolean isEngineOn){
        this.color = color;
        this.wheel = wheel;
        this.brake = brake;
        this.manufacturingYear = manufacturingYear;
        this.isEngineOn = isEngineOn;
    }

    //Constructor with 4 params
    public Vehicle(String color,int wheel,boolean brake,int manufacturingYear){
        this.color = color;
        this.wheel = wheel;
        this.brake = brake;
        this.manufacturingYear = manufacturingYear;
    }

    public void printData(){
        System.out.println("Color : "+color);
        System.out.println("No of Wheel : "+wheel);
        System.out.println("Brake : "+brake);
        System.out.println("Made year : "+manufacturingYear);
        System.out.println("Engine Status : "+isEngineOn);
    }

    public String turnOnEngine() {
        System.out.println("Car Engine is On");
        return "Car Engine is On";
    }

    public String turnOffEngine() {
        System.out.println("Engine is Off");
        return "Car Engine is Off";
    }
}


class VehicleImpl {
    public static void main(String[] args) {
        //Create object
        Vehicle car = new Vehicle();

       //Access data/method of an object
        car.color = "Red";

        System.out.println(car.turnOnEngine());
        System.out.println(car.turnOffEngine());

        System.out.println("-----------------------------");

        car.printData();

        System.out.println("-----------------------------");

        //Using constructor to initialize class variables
         Vehicle truck = new Vehicle("Blue",6,false,2020,true);

        truck.printData();

        System.out.println("-----------------------------");

        //Create Object & pass params
        Vehicle cycle = new Vehicle("Green",2,true,1970);

        //Call to method, which prints values
        cycle.printData();
    }
}
