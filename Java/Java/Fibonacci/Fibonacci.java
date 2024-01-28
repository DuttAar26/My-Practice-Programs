package Fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println("Here are the first "+ number + " numbers");
        // closing the scanner object
        input.close();
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        int temp = 0;
        int fibonacci = 0;
        if (number <= 20) {
            while(number >= fibonacci) {
            temp = num1 + num2; 
            System.out.println(temp);
            fibonacci = fibonacci + 1;
            num1 = num2;
            num2 = temp;
            if (fibonacci == number) {
                break;
            }
            
            }

        } else {
            System.out.println("Print a number below or exactly 20!");
        }

    }

    
}