package Pet;

public class Fish {
    int currentDepth = 0;

    public int dive (int depth){
        currentDepth = depth;
        return depth;
    }

    public void say(String word){
        System.out.println("Fish cannot talk la");
    }
}
