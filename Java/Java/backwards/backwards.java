package backwards;
import java.util.Scanner;
public class backwards {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String x = input.nextLine();
        int first = 0;
        String Final_String = "";
        int last = x.length();
        while (first < last) {
            last = last - 1;
            char backwards_String = x.charAt(last);
            Final_String = Final_String + backwards_String;
            //String Backwards = ""+Final_String;
            if (first == last) {
                System.out.println(Final_String);
                
            }
            
            
            
        } 
    }    
}
