/*public: accessible everywhere
  private: only within same class
  protected: same package + subclasses*/
    class Person {
    public String name = "Abhi";
    private int age = 23;

    public void show() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class oops2 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);  // allowed
        // System.out.println(p.age); // ❌ error: private
        p.show(); // ✅ allowed
    }
}

    
