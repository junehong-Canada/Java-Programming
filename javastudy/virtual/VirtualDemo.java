class Base {
  public void print() {
    System.out.println("In Base::print() function");
  }
}

class Child extends Base {
  public void print() {
    System.out.println("In Child::print() function");
  }
}


public class VirtualDemo {
  public static void main(String[] args){
    Child c = new Child();
    c.print();

    Base b = c;
    b.print();

    System.out.println(c);
    System.out.println(b);
  }
}

/**
In Java, all the functions except static or private or final
are virtual functions by default.
*/
