package OverridingExample;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow Meow...");
    }

    @Override
    public void makeSound(String sound) {
        System.out.println("Meow Meow...");
    }

}
