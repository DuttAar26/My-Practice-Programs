package Prime_Number;
import java.util.Scanner;
public class Prime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int num = input.nextInt();
        System.out.println("Your first number is " + num);
        System.out.println("Please enter your second number");
        int num2 = input.nextInt();
        System.out.println("Your second number is " + num2);
        if (num <= 1 || num2 <= 1) {
            System.out.println("Both entered numbers must be greater than 1");
            return;
        }
        
        if (num < num2) {
            for (int x =num; x < num2; x++) {
                int i = 2;
                for (i =2; i < x; i++) {
                    if (x % i == 0) {
                        System.out.println("This number is not a prime number " + x);
                        break;
                    } 
                }  
                if (x == i) {
                    System.out.println("This number is a prime number " + x);
                }
            }   
        } else {
            System.out.println("Make sure that your second number is greater than the first!");
        }
    }
}
