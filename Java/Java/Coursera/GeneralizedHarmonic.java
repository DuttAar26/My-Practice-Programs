package Coursera;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class GeneralizedHarmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        String x = input.nextLine();
        String[] y = x.split(",");
        int n = Integer.parseInt(y[0]);
        int r = Integer.parseInt(y[1]);
        float answer = 0;
        float lastans = 0;
        float j = 1;
        int i = 0;
        double final_answer = 0;
        int e = 0;
        // e is supposed to be the number of times the exponent goes for
        // n is supposed to be the number that you are supposed to go up to
        // r is supposed to be the exponent
        // j is supposed to be the answer before 1 is divided by it
        // lastans is supposed to be the last answer because you add the last answer to the current one

        for (i = 1; i <= n; i++) {
            System.out.println(i + " i");
            j = i;
            double first_answer = Math.pow(i, r);
            first_answer = 1 / first_answer;
            final_answer = final_answer + first_answer;
           
           
        }
        
        System.out.println(final_answer);
    }    
}
