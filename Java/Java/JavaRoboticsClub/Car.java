package JavaRoboticsClub;

public class Car {
    public static void main (String [] args) {
        Car Bike = new Car();
        Bike.Vehicle();
        Bike.Miles();
    }
    public int Vehicle() {
        System.out.println("cargo says: Machne running");
        return 5;
    }
    public int Miles() {
        return 10;
    }
    public int Price() {
        return 10000;
    }
}

