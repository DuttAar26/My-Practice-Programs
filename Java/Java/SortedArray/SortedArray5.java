package SortedArray;
import java.util.Scanner;
import java.util.Arrays;
public class SortedArray5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your first sorted string");
        String x = input.nextLine();
        System.out.println("Type in your second sorted string");
        String a = input.nextLine();
        System.out.println(x);
        System.out.println(a);
        int control = 0;
        int control2 = 0;
        int counter = 0;
        int first = 0;
        int thirdcount = 0;
        int fourthcount = 0;
        int fifthcount = 0;
        int sixthcount = 0;
        int last = x.length();
        int e = 0;
        int i = 0;
        String y[] = new String[(x.length() + 1) / 2];
        String y2[] = new String[(a.length() + 1) / 2];
        String y3[] = new String[(x.length() + 1) / 2];
        String y4[] = new String[(a.length() + 1) / 2];
        int first2 = 0;
        // Getting first string to an array
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
            System.out.println(Arrays.toString(y) + "y");
            System.out.println(z);
        }
        // finished getting first string to array
        // getting second string to array
        int first3 = 0;
        int last2 = a.length();
        int first4 = 0;
        int e2 = 0;
        int i2 = 0;
        while (first3 < last2) {
            if (a.charAt(first3) == ',') {
                String z2 = a.substring(i2, first3);
                y2[e2] = z2;
                e2 = e2 + 1;
                first4 = first4 + 1;
                i2 = first3 + 1;
                System.out.println(z2);
            }
            first3++;
        }
        if (first3 == last2) {
            String z2 = a.substring(i2, first3);
            y2[e2] = z2;
            System.out.println(z2);
            first4 = first4 + 1;
            System.out.println(Arrays.toString(y2) + " y2");
        }
        // finished getting second string to array
        // sorting first string array
        if (first2 > first4) {
            counter = first2;
        } else if (first4 > first2) {
            counter = first4;
        }
        else if (first4 == first2) {
            counter = first2;
        }
        String temp = null;
        for (int g = 0; g < first2; g++) {
            for (int t = g + 1; t < first2; t++) {
                int m = y[g].compareToIgnoreCase(y[t]);
                if (m > 0) {
                    temp = y[t];
                    y[t] = y[g];
                    y[g] = temp;
                }
            }
            y3[g] = y[g];
        }
        System.out.print(Arrays.toString(y3));
        // finished sorting first string array
        // sorting second string array
        String temp2 = null;
        for (int g2 = 0; g2 < first4; g2++) {
            for (int t2 = g2 + 1; t2 < first4; t2++) {
                if (y2[t2] != null && y2[g2] != null) {
                    int m2 = y2[g2].compareToIgnoreCase(y2[t2]);
                    if (m2 > 0) {
                        temp2 = y2[t2];
                        y2[t2] = y2[g2];
                        y2[g2] = temp2;
                    }
                }
            }    
            y4[g2] = y2[g2];
        }
        System.out.print(Arrays.toString(y4));
        System.out.println("y4");
        // finished sorting second string array
        String y5[] = new String[y3.length + y4.length];
        System.out.println(Arrays.toString(y5));
        int firstcount = 0;
        int secondcount = 0;
        int firstarraycounter = 0;
        int secondarraycounter = 0;

        // comparing the two arrays
        String temp3 = null;
        for (firstcount = 0; firstcount < first2 - 1; firstcount++) {
            System.out.println(y4[thirdcount] + " y4[thirdcount]");
            System.out.println(y3[secondcount]);
            if (Integer.parseInt(y3[secondcount]) < Integer.parseInt(y4[thirdcount])) {
                System.out.println("hello");
                fourthcount++;
                firstarraycounter++;
                
                
                
                y5[firstcount] = y3[secondcount];
                secondcount++;
            }
            else if (Integer.parseInt(y3[secondcount]) > Integer.parseInt(y4[thirdcount])) {
                System.out.println("hello 2");
                fifthcount++;
                y5[firstcount] = y4[thirdcount];
                secondarraycounter++;
                thirdcount++;
            }
            else if (Integer.parseInt(y3[secondcount]) == Integer.parseInt(y4[thirdcount])) {
                y5[firstcount] = y4[thirdcount];
                secondcount++;
                thirdcount++;
                fourthcount++;
                firstarraycounter++;
                secondarraycounter++;
                fifthcount++;
            }
            
        }
        
        // Now i am adding the extra numbers to the array
        
        System.out.println(Arrays.toString(y5));
        if (fourthcount > fifthcount) {
            while (secondcount < first2) {
                System.out.println(secondcount + " secondcount");
                System.out.println(first2 + " first2");
                System.out.println(firstcount);
               
                y5[firstcount] = y3[secondcount];
                firstcount++;
                secondcount++;
                
            }
            
            while (thirdcount < first4) {
                System.out.println(y4[thirdcount] + " y4[thirdcount]");
                System.out.println(firstcount);
                y5[firstcount] = y4[thirdcount];
                firstcount++;
                thirdcount++;
                
                
            }
            
        }
        else if (fourthcount < fifthcount) {
            while (thirdcount < first4) {
                System.out.println(y4[thirdcount] + " y4[thirdcount]");
                System.out.println(firstcount);
                y5[firstcount] = y4[thirdcount];
                firstcount++;
                thirdcount++;
                
                
            }
            while (secondcount < first2) {
                System.out.println(secondcount + " secondcount");
                System.out.println(first2 + " first2");
                System.out.println(firstcount);
               
                y5[firstcount] = y3[secondcount];
                firstcount++;
                secondcount++;
                
            }
        }
        else if (fourthcount == fifthcount) {
            while (thirdcount < first4) {
                System.out.println(y4[thirdcount] + " y4[thirdcount]");
                System.out.println(firstcount);
                y5[firstcount] = y4[thirdcount];
                firstcount++;
                thirdcount++;
                
                
            }
            while (secondcount < first2) {
                System.out.println(secondcount + " secondcount");
                System.out.println(first2 + " first2");
                System.out.println(firstcount);
               
                y5[firstcount] = y3[secondcount];
                firstcount++;
                secondcount++;
                
            }
        }
        
        
        System.out.println(Arrays.toString(y5));
        
        
    }            
}
