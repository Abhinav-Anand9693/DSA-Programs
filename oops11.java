//Super keyword access parent class element
class Animal {
    String color = "Brown";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println("Child color: " + color);         // Black
        System.out.println("Parent color: " + super.color);  // Brown
    }
}

public class oops11 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}

