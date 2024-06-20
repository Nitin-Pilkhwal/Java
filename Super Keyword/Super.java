public class Super {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.printColor();
        // When we call subclass constructor , super class constructor is call instantly by super(). This is the first line in every constructor which call the constructor of super class.
        // Every class extends the Object class
        System.out.println("Hello");
    }
}
class Animal {

    Animal(){
        // super();
        System.out.println("superclass constructor is called");
    }
}

class Dog extends Animal {
    String color;
    Dog(){
        // super();
        this.color = "black";
    }
    void printColor() {
        System.out.println(color); // prints color of Dog class
    }
}