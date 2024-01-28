package Tokenize;
import java.util.Scanner;


public class Tokenize {
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
            if (x.charAt(b) == ' ' && b < x.length()) {
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
        if (b >= x.length()){
            System.out.println(x.substring(a, b));  
            
        } 
            
        


        // while (x.length() > b) {
        //     switch(x.charAt(b)) {
        //         case ' ':
        //             System.out.println(x.substring(a, b));
        //             a = b + 1;
        //             count = count + 1;
        //             while (count > 1) {
        //                 b = b + 1;
                    
        //             }
        //         default:
        //             count = 0;
               
                
            
        //     }         
        //     b = b + 1;
        // } System.out.println(x.substring(a, b));   
          
          
    }     

    
    
}
