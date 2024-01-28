package Factorial;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int number = input.nextInt();
        System.out.println("You entered " + number);
        // closing the scanner object
        input.close();
        int answer = 1;
        for (int i = 1; i <= number; i++) {
            answer = answer * i;
        }
        System.out.println("The factorial is " + answer);
    }
}