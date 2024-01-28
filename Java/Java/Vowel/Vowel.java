package Vowel;
import java.util.Scanner;
public class Vowel {

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence :");
        String x = input.nextLine();
        x = x.toLowerCase();
        int a = 0;
        int e = 0;
        int i = 0;
        int u = 0;
        int o = 0;
        int first = 0;
        int last = x.length() - 1;
        input.close();
        while (first < last) {
            first = first + 1;
            System.out.println(first);
            switch (x) {

        
                case "a":
                    a = a + 1;
                    System.out.println("a = " + a);
                case "e":
                    e = e + 1;
                    System.out.println("e = " + e);
                case "i":
                    i = i + 1;
                    System.out.println("i = " + i);    
                case "u":
                    u = u + 1;
                    System.out.println("u = " + u);
                case "o":
                    o = o + 1;
                    System.out.println("o = " + o);  
            
                
                
            }
        }   
    }    
}                