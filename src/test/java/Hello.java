import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Vehicle {
   int wheel;
   String engine;
   String color;

   public void startEngine(){};
   public void stopEngine(){};
   public void applyBrake(){};

   public static void main(String args[]){
       Vehicle veh1 = new Vehicle();
       veh1.applyBrake();

       WebDriver driver = new ChromeDriver();
   }

}


