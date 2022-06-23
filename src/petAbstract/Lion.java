package petAbstract;

public class Lion extends Pet {


    @Override
    void walk() {
        System.out.println("Lion is Walking...");
    }

    @Override
    void eat() {
        System.out.println("Lion is eating...");
    }

}
