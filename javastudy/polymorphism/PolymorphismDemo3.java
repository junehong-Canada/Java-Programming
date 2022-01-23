interface I2 {
  public String A();
}
interface I3 {
  public String B();
}
class D implements I2, I3 {
  public String A() {
    return "A";
  }
  public String B() {
    return "B";
  }
}
public class PolymorphismDemo3 {
  public static void main(String[] args) {
    D obj = new D();
    I2 objI2 = new D();
    I3 objI3 = new D();

    obj.A();
    obj.B();

    objI2.A();
    // objI2.B();  // error: cannot find symbol, coz the data type of objI2 is I2

    // objI3.A();  // error: cannot find symbol, coz the data type of objI3 is I3
    objI3.B();
  }
}
