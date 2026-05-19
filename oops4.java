// Parent class (Super class)
//InheritanceExample
class Animal {
    void eat() {
        System.out.println("I can eat");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("I can bark");
    }
}

// Main class
public class oops4 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();   // Inherited from Animal
        d1.bark();  // Defined in Dog
    }
}

