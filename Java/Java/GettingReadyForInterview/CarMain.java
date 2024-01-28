package GettingReadyForInterview;

import java.util.Scanner;

public class CarMain {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in the name of the car you want!");
        String x = input.nextLine();
        car myCar = new car(x);
        myCar.drive(6);
    }
}
