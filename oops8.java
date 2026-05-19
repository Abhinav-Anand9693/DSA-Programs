//CompilePoly method overloading
class Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
}

public class oops8 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(2, 3);
        c.add(2.5, 3.5);
        c.add(1, 2, 3);
    }
}

