package GettingReadyForInterview;

public class car {
    String carName;
    public car (String carName) {
        this.carName = carName;
    }
    public int drive(int howlong) {
        if (carName.equals("Tesla")) {
            System.out.println(60 * howlong);
            return 60 * howlong;
        }
        if (carName.equals("Toyota")) {
            System.out.println(30 * howlong);
            return 30 * howlong;
        }
        System.out.println("0");
        return 0;
    }
}
