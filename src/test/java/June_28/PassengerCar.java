package June_28;

import June_27.Vehicle;
import June_7_2020.ForLoopExample;

//extends keyword is used to inherit from parent class
public class PassengerCar extends Vehicle {

    //Reimplemented method of parent class
    public String turnOffEngine() {
        System.out.println("Engine is Off - from child class");
        return "Car Engine is Off";
    }

    //new method
    public void isAcOn() {
        System.out.println("AC is on");
    }

    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar();
        passengerCar.turnOnEngine(); //being used from Parent class
        passengerCar.turnOffEngine(); //Reimplemented
        passengerCar.isAcOn(); //This is a new method
    }
}

//Third level inheritance
class HybridCar extends PassengerCar {
    public static void main(String[] args) {
        HybridCar hybridCar = new HybridCar();
        hybridCar.isAcOn(); //calling method from immediate parent class -> PassengerCar
        hybridCar.turnOnEngine(); //calling method from super parent class -> Vehicle
    }
}

