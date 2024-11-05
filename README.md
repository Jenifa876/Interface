# Interface
**Overview**
This Java program demonstrates the usage of interfaces, method inheritance, and implementation of methods in a class that inherits multiple interfaces. Specifically, the program showcases how:

A default method in an interface can be inherited.
Multiple interfaces can be implemented by a single class.
Method overriding is used in a class implementing interfaces to fulfill their contract.
**Code Explanation**
**1. Interface Base**
java
Copy code
interface Base {
    default void show() {
        System.out.println("Show");
    }
}
The Base interface declares a default method called show(). Default methods are a feature introduced in Java 8, which allows interfaces to have method implementations.
Any class implementing this interface can directly use the show() method without needing to override it unless desired.
**2. Interface Interface1**
java
Copy code
interface Interface1 extends Base {
    void display();
}
Interface1 extends the Base interface. This means that Interface1 inherits the default show() method from Base.
Additionally, Interface1 defines an abstract method display(), which must be implemented by any class that implements Interface1.
**3. Interface Interface2**
java
Copy code
interface Interface2 extends Base {
    void print();
}
Interface2 also extends Base, inheriting the show() method from Base.
Like Interface1, Interface2 defines an abstract method print(), which must be implemented by any class that implements Interface2.
**4. Class Test**
java
Copy code
class Test implements Interface1, Interface2 {
    public void display() {
        System.out.println("Display");
    }

    public void print() {
        System.out.println("Print");
    }
}
The Test class implements both Interface1 and Interface2, which means it is required to implement all the abstract methods declared in these interfaces: display() and print().
In this class, the display() method prints "Display" and the print() method prints "Print".
Since the show() method is already provided as a default in the Base interface, there is no need to override it unless desired.
5. Main Class Ex8_2
java
Copy code
class Ex8_2 {
    public static void main(String s[]) {
        Test t = new Test();
        t.show();
        t.display();
        t.print();
    }
}
The main method creates an instance of the Test class and calls all three methods: show(), display(), and print().
t.show() calls the inherited default show() method from Base, printing "Show".
t.display() prints "Display", which is the implementation from the Test class.
t.print() prints "Print", also implemented in the Test class.
**Output**
When you run this program, the following output will be displayed:

mathematica
Copy code
Show
Display
Print
Key Concepts
Default Methods: Interfaces can have methods with a default implementation. Classes that implement the interface do not have to implement the method unless they want to provide their own version.
Multiple Inheritance with Interfaces: A class can implement multiple interfaces, each potentially declaring abstract methods. The class must provide implementations for all abstract methods from all the interfaces it implements.
Method Resolution: If an interface provides a default method, the class implementing that interface can choose to override it, but it isn't required to do so. If a class implements multiple interfaces that provide default methods with the same name, the compiler will raise an error unless the class explicitly overrides the method.
**How to Run**
Save the code in a file named Ex8_2.java.
Compile the Java code using the command:
bash
Copy code
javac Ex8_2.java
Run the compiled program:
bash
Copy code
java Ex8_2
You should see the following output:
mathematica
Copy code
Show
Display
Print
**Conclusion**
This program demonstrates how Java interfaces and default methods can be used to provide default behavior while still enforcing the implementation of required methods in the implementing class. It also highlights the ability to implement multiple interfaces and the flexibility of method inheritance in Java.
