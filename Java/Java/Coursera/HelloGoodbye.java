package Coursera;
import java.util.Scanner;
import java.util.Arrays;
public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two names");
        String x = input.nextLine();
        String[] y = x.split(",");
        System.out.println("Hello " + y[0] + " and " + y[1]);
        System.out.println("Goodbye " + y[1]+ " and " + y[0]);

    }
}
