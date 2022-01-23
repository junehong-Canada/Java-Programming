abstract class A {
  public abstract int b();
  // error: abstract methods cannot have a body
  // public abstract int c() {System.out.println("Hello");}
  // abstract class can have non-abstract methods
  public void d() {
    System.out.println("world");
  }
}

class B extends A {
    public int b() { return 1; }  // Overriding abstract methods
}

public class AbstractDemo {
  public static void main(String[] args) {
    // A obj = new A();  // error: A is abstract; cannot be instantiated
    // Abstract class cannot be instantiated.
    B obj = new B();
    System.out.println(obj.b());
  }
}
