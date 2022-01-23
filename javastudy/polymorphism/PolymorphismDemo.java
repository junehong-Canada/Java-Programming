// package javastudy.polymorphism;

/**
  Polymorphism - Overloading
*/

class O {
  public void a(int param) {
    System.out.println("print integer");
    System.out.println(param);
  }

  public void a(String param) {
    System.out.println("print string");
    System.out.println(param);
  }
}

public class PolymorphismDemo {
  public static void main(String[] args) {
    O o = new O();
    o.a(1);   // same name of method but different parameters and operations
    o.a("one");
    System.out.println("main");
  }
}
