package Car;
public class Car {
    public void stop() {
        System.out.println("Stopping");
    }
    public void start() {
        System.out.println("Starting");
    }
    public int drive(int howlong) {
        int distance = howlong * 60;
        return distance;
    }
}