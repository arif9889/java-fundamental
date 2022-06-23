package Pet;

public class PetMaster {
    public static void main(String[] args) {
        Pet myPet1 = new Pet("Goofball");
        Pet myPet2 = new Pet("Henry");

        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.say("Meow");



        myPet1.isSameName(myPet2);
        myPet1.eat();
        myPet1.say("Woof Woof");
        myPet1.sleep();

    }
}
