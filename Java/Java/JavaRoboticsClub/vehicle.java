package JavaRoboticsClub;

public class vehicle {
    private int weight;
    private int doors;
    private int wheel;
    private double top_wheel;
    private double top_speed;
    public vehicle(int weight, int doors, int wheel, double top_speed) {
        this.weight = weight;
        this.doors = doors;
        this.wheel = wheel;
        this.top_speed = top_speed;
        System.out.println("h");
    }
    public int i(int i) {
        System.out.println("123");
        return 1;
    }
    public int i(int i, int n) {
        return 2;
    }
    public int i(int i, int n, int t) {
        return 3;
    }
}
