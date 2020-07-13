package OverridingExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


//Method overriding happens across parent/child class, method will have same parameters
//Method overloding happens in same class, method will have different number of parameters & type of parameters will also be different
public class OverridingImpl {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        //Simple class -> object -> calling methods
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();


        //Overriding
        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();

        animal = new Horse();
        animal.makeSound();

       /* WebDriver driver =  new FirefoxDriver();
        driver.get("http://google.co.in");

        driver = new ChromeDriver();
        driver.get("");

        driver = new InternetExplorerDriver();
        driver.get("");*/
    }
}
