package LCM;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number.");
        int number = input.nextInt();
        System.out.println("Please enter your second number.");
        int number2 = input.nextInt();
        System.out.println("Your numbers are "+ number + " and " + number2 + ".");
        // Closing the Scanner Object
        input.close();
        if (number != number2) {
            while (number != number2) {
                number = number + number;
                number2 = number2 + number2;
                System.out.println(number);
                System.out.println(number2);
                System.out.println("The least common multiple is "+number+".");
            }

            

        }       
     
        

    }
    
}