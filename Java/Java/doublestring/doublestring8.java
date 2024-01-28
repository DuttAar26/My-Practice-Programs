package doublestring;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class doublestring8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1-10 Strings");
        String x = input.nextLine();
        int control = 0;
        int count2 = 0;
        int count3 = 0;
        int yeet = 0;
        int control2 = 0;
        int hello = 0;
        int first = 0;
        int last = x.length();
        int i = 0;
        int e = 0;
        int counter = 0;
        int g = 0;
        int j = 0;
        int first2 = 0;
        int count = 0;
        int last2 = x.length();
        int hey = 0;
        int v = 0;
        int superhero = 0;
        int first3 = 0;
        int first7 = 0;
        int first8 = 0;
        // counting actual number of strings
        while (first3 < last2) {
            if (x.charAt(first3) == ',') {
                count++;
            }
            first3++;
        }
        // .. ends
        int last4 = count + 1;
        int first5 = 0;
        int last5 = count + 1;
        String y[] = new String[count + 1];
        String y2[] = new String[count + 1];
        int first4 = 0;
        // step 1 : forming an array with entered words
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
        // end of step 1

        // step 2: sort the array
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
        // end of step 2

        // step 3: remove duplicates
        List<String> sortedArray = new ArrayList<String>();
        int finalListIndex = 0;
        sortedArray.add(y2[0]);
        for (int index = 1; index < y2.length; index++) {
            if (y2[index].equals(sortedArray.get(finalListIndex))) {
                continue;
            } else {
                sortedArray.add(y2[index]);
                finalListIndex++;
            }
        }
        System.out.println(sortedArray.toString());
        // end of step 3
    } 
}







