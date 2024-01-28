package Vowel;
import java.util.Scanner;
public class Vowel2 {

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String x = input.nextLine();
        int a = 0;
        int e = 0;
        int i = 0;
        int u = 0;
        int o = 0;
        x = x.toLowerCase();
        for (int b =0; b < x.length(); b++) {
            switch (x.charAt(b)) {
                case 'a':
                    a = a + 1;
                    break;
                case 'e':
                    e = e + 1;
                    break;
                case 'i':
                    i = i + 1; 
                    break;
                case 'u':
                    u = u + 1;
                    break;
                case 'o':
                    o = o + 1;
                    break;  
            }
        } System.out.println("a = " + a); 
          System.out.println("e = " + e);  
          System.out.println("i = " + i);     
          System.out.println("u = " + u); 
          System.out.println("o = " + o);  
           
    }            
}                 