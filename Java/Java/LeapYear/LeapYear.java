package LeapYear;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = input.nextInt();
        System.out.println("You entered "+ year);
        // closing the scanner object
        input.close();
        if (year % 4 != 0) {
            System.out.println("This is not a leap year");

        }
        else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("This is not a leap year");

        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("This is a leap year");

        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("This is a leap year");

        }


    }
}