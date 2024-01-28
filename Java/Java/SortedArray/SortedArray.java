package SortedArray;
import java.util.Scanner;
import java.util.Arrays;
public class SortedArray {
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
            System.out.println(Arrays.toString(y2) + " y2");
            
            System.out.println(e2);
            String z2 = a.substring(i2, first3);
            System.out.println(z2);
            y2[e2] = z2;
            
            first4 = first4 + 1;
            
        }
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(y2));
    }
    
}            