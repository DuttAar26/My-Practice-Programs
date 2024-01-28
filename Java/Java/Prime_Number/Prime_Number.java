package Prime_Number;
import java.util.Scanner;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  a number");
        int num = input.nextInt();
        System.out.println("Your number is " + num);
        int count = 1;
        if (num > 2) {
            while (count < num) {
            count = count + 1;
                if (num % count == 0) {
                    System.out.println("This is not a prime number");
                    break;

                } else {
                    System.out.println(num + " is a prime number");
                    break;
                }

            }   

        
        } else {
            System.out.println("Print a number greater than 2!");
        }
    }
}