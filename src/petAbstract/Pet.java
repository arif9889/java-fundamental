package petAbstract;

//TODO: Create an Abstract class Animal with:
//	A. Data member - name,noOfLegs,colour
//	B. member function- void walk()(abstract method) , void eat()(abstract) , void sleeping(non-abstract.
//  C. This class will have 2 child class Dog, Lion.
//  Write a Program to implement the above methods.
public abstract class Pet {
    String name;
    int noOfLegs;
    String colour;

    abstract void walk();

    abstract void eat();

    void sleeping() {
        System.out.println("Zzzzzzzz");
    }
}
