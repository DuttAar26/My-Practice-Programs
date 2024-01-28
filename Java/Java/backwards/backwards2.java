package backwards;
import java.util.Scanner;
public class backwards2 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String x = input.nextLine();
        int first = 0;
        String Final_String = reverse(x);
        int first2 = 0;
        int word_start = 0;
        System.out.println(Final_String);
        String Final_String2 = "";
        int last3 = Final_String.length();
        int i = Final_String.length();
        while (first2 < last3) {
            last3 = last3 - 1;
            if (Final_String.charAt(last3) == ' ') {
                String b = (reverse(Final_String.substring(last3, i)));
                Final_String2 = b + Final_String2;
                i = last3;
            }
            
        } 
        if (first2 == last3) {
            String b =(reverse(Final_String.substring(last3, i)));
            b = b + " ";
            Final_String2 = b + Final_String2;
            System.out.println(Final_String2);
        } 
    }   

    public static String reverse(String input) {
        String Final_String = "";
        int last = input.length();
        int first = 0;
        while (first < last) {
            last = last - 1;
            char backwards_String = input.charAt(last);
            Final_String = Final_String + backwards_String;
            if (first == last) {
                break;
            }
        }
        return Final_String;
    } 
    
}

