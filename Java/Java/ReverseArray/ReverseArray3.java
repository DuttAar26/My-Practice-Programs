package ReverseArray;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1-10 one-digit numbers");
        String x = input.nextLine();
        int first = 0;
        int last = x.length();
        int i = 0;
        int e = 0;
        int count = 0;
        String y[] = new String[(x.length() + 1) / 2];
        String y2[] = new String[(x.length() + 1) / 2];
        int last2 = (x.length() + 1) / 2;
        int first2 = 0;
        while (first < last) {
            if (x.charAt(first) == ',') {
                String z = x.substring(i,first);
                y[e] = z; 
                e = e + 1;
                i = first + 1;  
            } 
            first++;          
        }
        if (first == last) {
            String z = x.substring(i, first);
            y[e] = z; 
            i = first + 1;
            System.out.println(Arrays.toString(y));  
        } 
        while (first2 < last2) {
            last2--;
            y2[count] = y[last2];
            count = count + 1;
        } 
        if (first2 == last2) {
            System.out.println(Arrays.toString(y2));  
        }
    } 
}

