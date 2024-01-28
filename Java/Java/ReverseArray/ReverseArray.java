package ReverseArray;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1-10 one-digit numbers");
        String x = input.nextLine();
        int first = 0;
        int last = x.length();
        int i = 0;
        int e = 0;
        String y[] = new String[10];
        while (first < last) {
            if (x.charAt(first) == ',') {
                String z = x.substring(i,first);
                y[e] = z; 
                e = e + 1;
                i = first + 1;
                System.out.println(Arrays.toString(y));
                
                
                
            } 
            first++;
            
        } if (first == last) {
            String z = x.substring(i, first);
            y[e] = z; 
            i = first + 1;
            System.out.println(Arrays.toString(y));
                
            
            
        } 
        

    } 
}
