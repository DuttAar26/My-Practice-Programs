package backwards;
import java.util.Scanner;
public class backwards3 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String x = input.nextLine();
        int first = 0;
        String Final_String = reverse(x);
        int first2 = 0;
        int word_start = 0;
        System.out.println(Final_String);
        int last3 = Final_String.length();
        while (first2 < last3) {
            if (Final_String.charAt(first2) == ' ') {
                System.out.println(reverse(Final_String.substring(word_start, first2)));
                word_start = first2;
            }
            first2++;
        } 
        if (first2 == last3) {
            System.out.println(reverse(Final_String.substring(word_start, first2)));
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

