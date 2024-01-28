package Tokenize;
import java.util.Scanner;
public class Tokenize3 {
    public static void main(String[] args) {
        int b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String x = input.nextLine();
        int a = 0;
        int first = 0;
        int last = x.length() - 1;
        //int count = 0;
        while (b < x.length()) {     
            while (first < last) {
                first = first + 1;
                last = last - 1;
                if (x.charAt(first) == ' ' || x.charAt(last) == ' ') {
                    System.out.println(x.substring(a, b));
                    b = b + 1;
                    while (b < x.length() && x.charAt(b) == ' ') {
                        b = b + 1;
                    }
                    a = b;     
                } else {
                    b = b + 1;
                }
            }   
        } if (b >= x.length()){
            System.out.println(x.substring(a, b)); 
        }     
                
            
        
    }        
}