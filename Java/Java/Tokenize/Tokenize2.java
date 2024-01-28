package Tokenize;
import java.util.Scanner;


public class Tokenize2 {
    public static void main(String[] args) {
        int b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String x = input.nextLine();
        int a = 0;
        int count = 0;
        while (x.length() > b) {
            if (x.charAt(b) == ' ') {
                System.out.println(x.substring(a, b));   
                a = b + 1;
                count = count + 1;
                
            } else {
                count = 0;
            }
            

        } System.out.println(x.substring(a, b));   
        
    }     

    
    
}
