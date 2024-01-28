package Array;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        System.out.println("Your number is " + num);
        int x [] = {10, 20, 30, 40};
        if (x[0] == num || x[1] == num || x[2] == num || x[3] == num) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
            
        }
    }
}