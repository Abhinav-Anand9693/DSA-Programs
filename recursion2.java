//StackOverflowExample
public class recursion2 {
    static void callMe() {
        System.out.println("Calling...");
        callMe();  // no base case → infinite recursion
    }

    public static void main(String[] args) {
        callMe();  // triggers stack overflow
    }
}

