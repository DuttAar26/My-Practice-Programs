package Coursera;
import java.util.Scanner;
import java.util.Arrays;
public class RightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        String x = input.nextLine();
        String[] y = x.split(",");
        int first = 0;
        int Last_value = 0;
        String last_value = "";
        for (int i = 0; i < y.length; i++) {
            for (int j = i + 1; j < y.length; j++) {
                while (first < y.length) {
                   if (Integer.parseInt(y[first]) != Integer.parseInt(y[i]) && Integer.parseInt(y[first]) != Integer.parseInt(y[j])) {
                       last_value = y[first];
                       Last_value = Integer.parseInt(last_value);
                       Last_value = Last_value * Last_value;
                    }
                    first++;
                }    
                if (Last_value == (Integer.parseInt(y[i]) * Integer.parseInt(y[i]) + (Integer.parseInt(y[j]) * Integer.parseInt(y[j])))) {
                    System.out.println("You have a right triangle.");
                }
                first = 0;
            }
        }
    }
}
