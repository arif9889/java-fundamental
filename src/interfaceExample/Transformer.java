package interfaceExample;

public class Transformer implements Car, Person {
    public static void main(String[] args) {
        Transformer trans = new Transformer();
        trans.blowHorn();
        trans.move();
        trans.talk();
        trans.walk();

    }

    @Override
    public void blowHorn() {
        System.out.println("BB blowing horn");
    }

    @Override
    public void move() {
        System.out.println("BB is moving");
    }

    @Override
    public void walk() {
        System.out.println("BB is walking..");
    }

    @Override
    public void talk() {
        System.out.println("Im BumbleBee");
    }
}
