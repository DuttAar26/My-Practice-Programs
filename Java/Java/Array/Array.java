package Array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        System.out.println("Your number is " + num);
        int x [] = {10, 20, 30, 40, 59, 67, 1, 100, 56, 89, 143, 5};
        for (int i =0; i < x.length; i++) {
            if (x[i] == num) {
                System.out.println("Found");
                break;
            } else {
                continue;
                
            }
            
        }
            
    
    }
}