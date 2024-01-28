package Temperature;
import java.util.Scanner;

import javax.sql.ConnectionEvent;
public class TemperatureMeasurer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature;
        System.out.println("Please enter an integer");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Please Enter a number greater than 0");
            return;
        }

        System.out.println("Please enter the system you want to convert to.");
        String convert = input.next();

        if (convert.length() > 1) {
            // print error 
            System.out.println("Please enter one letter");
            return;
        }

        if (convert.toCharArray()[0] == 'C' || convert.toCharArray()[0] == 'F') {
            // call your method 
            Temperature myTemperature = new Temperature();
            myTemperature.ConvertTemp(number, convert.toCharArray()[0]);
            return;
        } else {
            // print error 
            System.out.println("You have to enter either 'C' or 'F'");
            return;
            
        }
    }
}