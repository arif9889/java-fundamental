package petAbstract;
//TODO: Create an Abstract class Animal with:
//	A. Data member - name,noOfLegs,colour
//	B. member function- void walk()(abstract method) , void eat()(abstract) , void sleeping(non-abstract.
//  C. This class will have 2 child class Dog, Lion.
//  Write a Program to implement the above methods.

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Lion lion = new Lion();

        dog.eat(); //abstract
        dog.walk();
        dog.sleeping(); //non abstract

        lion.eat();
        lion.walk();
        lion.sleeping();
    }
}
