package petAbstract;

public class Dog extends Pet {

    @Override
    void walk() {
        System.out.println("Dog is Walking...");
    }

    @Override
    void eat() {
        System.out.println("Dog is Eating...");
    }

}
