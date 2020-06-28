package June_28;

public class SportsCar extends PassengerCar implements FirstInterface {

    public String centralLock() {
        System.out.println("Method from interface");
        return "Interface";
    }

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.centralLock();
        sportsCar.turnOnEngine();


    }
}
