package StringComparison;
import java.util.Scanner;
import java.util.Arrays;
public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1-10 Strings");
        String x = input.nextLine();
        String f = "";
        int first = 0;
        int last = x.length();
        int i = 0;
        int e = 0;
        int g = 0;
        int first2 = 0;
        int count = 0;
        String y[] = new String[x.length() / 2];
        int last2 = x.length() / 2;
        while (first < last) {
            if (x.charAt(first) == ',') {
                String z = x.substring(i, first);
                y[e] = z;
                e = e + 1;
                i = first + 1;
            }
            first++;
        }
        if (first == last) {
            String z = x.substring(i, first);
            y[e] = z;
            System.out.println(Arrays.toString(y));
        }
        






    }
}