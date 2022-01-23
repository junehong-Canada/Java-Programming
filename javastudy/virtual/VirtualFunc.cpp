#include <iostream>
using namespace std;

class Base {
public:
  virtual void print() {
    cout << "In Base::print() function \n";
  }
};

class Child : public Base {
public:
  void print() {
    cout << "In Child::print() function \n";
  }
};

int main() {
  Base b;
  b.print();  // Case 1, In Base::print() function

  Child c;
  c.print();  // Case 2, In Child::print() function

  Base b1 = c;
  b1.print();  // Case 3, In Base::print() function

  Base *b2 = &c;
  b2.print();  // Case 4, In Child::print() function, not In Base::print() function

  ((Base)c).print();  // Case 5,In Base::print() function

  return 0;

}

/**
A virtual class is a nested inner class whose functions and member variables
can be overridden and redefined by subclasses of an outer class.
*/
