package OverridingExample;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Bark Bark ...");
    }
}
