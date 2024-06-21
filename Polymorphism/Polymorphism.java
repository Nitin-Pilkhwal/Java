package Polymorphism;

// Method overriding
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
    
    public void makeSound(String sound) {
        System.out.println("The dog " + sound);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: The animal makes a sound
        
        Dog dog = new Dog();
        dog.makeSound(); // Output: The dog barks
        
        dog.makeSound("howls"); // Output: The dog howls
    }
}

// method overloading
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}