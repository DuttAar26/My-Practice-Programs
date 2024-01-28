package JavaRoboticsClub;

public class Bike extends Car {
    public static void main(String[] args) {
        Bike a = new Bike();
        System.out.println(a.miles());
        System.out.println(a.Price());
    }
    public int miles() {
        return super.Miles() - 5;
    }
    public int Price() {
        return super.Price() / 2;
    }
}
