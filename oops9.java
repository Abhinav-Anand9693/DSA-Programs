// Runtime polymo method overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class oops9 {
    public static void main(String[] args) {
        Animal a;        // Reference of parent class
        a = new Dog();   // Object of child class

        a.sound(); // Calls Dog's sound() → Runtime decision
    }
}

