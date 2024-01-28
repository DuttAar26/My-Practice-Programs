package StringComparison;
import java.util.Scanner;
import java.util.Arrays;
public class StringComparison2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1-10 Strings");
        String x = input.nextLine();
        int control = 0;
        String f = "";
        int first = 0;
        int last = x.length();
        int i = 0;
        int e = 0;
        int g = 0;
        int first2 = 0;
        int count = 0;
        String y[] = new String[x.length() / 2];
        String y2[] = new String[x.length() / 2];
        int last2 = x.length() / 2;
        while (first < last) {
            if (x.charAt(first) == ',') {
                String z = x.substring(i, first);
                y[e] = z;
                e = e + 1;
                i = first + 1;
                first2 = first2 + 1;
            }
            first++;
        }
        if (first == last) {
            String z = x.substring(i, first);
            y[e] = z;
            first2 = first2 + 1;
        }
        for (g = 0; g < first2; g++) {
            if (y[g] != null && y[g+1] != null) {
                int m = y[g].compareTo(y[g+1]);
                if (m > 0) {
                    System.out.println("what");
                    y2[count] = y[g];
                    y2[count + 1] = y[g+1];
                    
                    
                } 
                else if (m < 0) {
                    System.out.println("hello");
                    y2[count + 1] = y[g + 1];
                    y2[count] = y[g];
                    
                    
                }
                else if (m == 0) {
                    System.out.println("ok");
                    y2[count + 1] = y[g];
                    y2[count] = y[g + 1];
                    
                }
                count++;
            }    
        }
        System.out.println(Arrays.toString(y2));

        
        






    }
}
