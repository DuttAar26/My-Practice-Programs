package Car;
public class CarOwner {
    public static void main(String[] args) {
        int distance;
        Car myCar = new Car();
        JamesBondCar myJamesBondCar = new JamesBondCar();
        myCar.start();
        distance = myCar.drive(3);
        System.out.println(distance);
        myCar.stop();
        System.out.println("Now we are using JamesBondCar");
        myJamesBondCar.start();
        distance = myJamesBondCar.drive(3);
        System.out.println(distance);
        myJamesBondCar.stop();
        




    }
}