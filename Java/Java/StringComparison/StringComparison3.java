package StringComparison;
import java.util.Scanner;
import java.util.Arrays;
public class StringComparison3 {
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
        int last2 = x.length();
        int first3 = 0;
        while (first3 < last2) {
            if (x.charAt(first3) == ',') {
                count++;
            }
            first3++;
        }
        String y[] = new String[count + 1];
        String y2[] = new String[count + 1];
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
        String temp = null;
        for (g = 0; g < first2; g++) {
            for (int t = g + 1; t < first2; t++) {
                int m = y[g].compareToIgnoreCase(y[t]);
                if (m > 0) {
                    temp = y[t];
                    y[t] = y[g];
                    y[g] = temp;
                }
            }
            y2[g] = y[g];
        }    
        System.out.println(Arrays.toString(y2));

    } 
}

