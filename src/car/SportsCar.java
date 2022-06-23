package car;

public class SportsCar extends Car{

    public int drive(int time){
        int distance = time * 100;
        System.out.println( "Sport Car distance : " +distance);
        return distance;
    }
}
