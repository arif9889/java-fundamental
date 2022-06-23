package Pet;

public class Pet {
    private int age;
    private int height;
    private int weight;
    private String color;
    private String name;

    Pet(String name) {
        this.name = name;
    }

    public Pet() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("eating food");
    }

    public void sleep() {
        System.out.println("Goodnight");
    }

    public void say(String word) {
        System.out.println(word);
    }

    public boolean isSameName(Pet pet) {
        if (pet.name == this.getName()) {
            System.out.println("Both pet are same name");
            return true;
        } else {
            System.out.println("Both pet are different name");
        }
        return false;
    }
}
