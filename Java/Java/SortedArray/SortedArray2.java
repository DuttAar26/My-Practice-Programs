package SortedArray;
import java.util.Scanner;
import java.util.Arrays;
public class SortedArray2 {
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
        int last = x.length();
        int e = 0;
        int i = 0;
        String y[] = new String[(x.length() + 1) / 2];
        String y2[] = new String[(x.length() + 1) / 2];
        String y3[] = new String[(x.length() + 1) / 2];
        String y4[] = new String[(x.length() + 1) / 2];
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
        for (int g2 = 0; g2 < first2; g2++) {
            for (int t2 = g2 + 1; t2 < first2; t2++) {
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
        // finished sorting second string array
        String y5[] = new String[y3.length + y4.length];
        System.out.println(Arrays.toString(y5));
        int firstcount = 0;
        int secondcount = 0;
        first2 = first2 + first2;

        // comparing the two arrays
        String temp3 = null;
        for (firstcount = 0; firstcount < first2 - 2; firstcount++) {
            secondcount++;
            System.out.println("firstcount " + firstcount);
            System.out.println("secondcount " + secondcount);
                
                if (secondcount < x.length()  && secondcount < a.length() ) {
                    if (Integer.parseInt(y3[firstcount]) > Integer.parseInt(y4[firstcount])) {
                        temp3 = y4[firstcount];
                        y5[secondcount] = y3[firstcount];
                        y5[firstcount] = temp3;
                        System.out.println("one");
                        System.out.println(Arrays.toString(y5));
                        
                        
                        
                    
                    } 
                    else if (Integer.parseInt(y3[firstcount]) < Integer.parseInt(y4[firstcount])) {
                        if (counter > 0) {
                            y5[secondcount] = y4[firstcount];
                            temp3 = y3[firstcount];
                            System.out.println("ELSE 2");
                            y5[firstcount] = temp3;
                        } else {
                            System.out.println("ELSE");
                            temp3 = y3[firstcount];
                            
                            y5[firstcount] = temp3;
                        }
                        counter++;
                        
                        System.out.println("two");
                        System.out.println(Arrays.toString(y5));
                        System.out.println(y4[firstcount] + " firstcount");
                        System.out.println(y3[firstcount] + " firstcount");
                        thirdcount++;
                        
                        
                        
                        
                       
                    
                    }
                    
                    else if (Integer.parseInt(y3[firstcount]) == Integer.parseInt(y4[firstcount])) {
                        temp3 = y4[firstcount];
                        y5[firstcount] = y4[firstcount];
                        y5[secondcount] = temp3;
                        System.out.println("three");
                        System.out.println(Arrays.toString(y5));
                        secondcount++;
                        thirdcount++;
                        break;
                    }
                    
                }   
                else if (secondcount < x.length() - 1 && secondcount > a.length() - 1) {
                    y5[firstcount] = y3[firstcount];
                    System.out.println("four");
                    System.out.println(Arrays.toString(y5));
                    secondcount++;
                    break;
                } 
                else if (secondcount < x.length() - 1 && secondcount < a.length() - 1) {
                    y5[firstcount] = y4[firstcount];
                    System.out.println("five");
                    System.out.println(Arrays.toString(y5));
                    secondcount++;
                    break;
                }
                if (secondcount == x.length() && secondcount == a.length()) {
                    temp3 = y3[firstcount];
                    y5[secondcount] = y4[firstcount];
                    y5[firstcount] = temp3;
                    System.out.println("HI");
                }
                
                else if (thirdcount == x.length() && thirdcount == a.length()) {

                    System.out.println(Arrays.toString(y5));
                    control = firstcount;
                    control2 = secondcount;
                    while (counter < x.length()) {
                        temp3 = y3[control];
                        y5[control2] = y4[firstcount];
                        y5[control] = temp3;
                        y5[control2 + 1] = y4[firstcount + 1];
                        counter++;
                        control++;
                        control2++;
                    }
                    
                    System.out.println("break");
                    System.out.println("y3[firstcount] = " + y3[firstcount]);
                    System.out.println("y4[firstcount] = " + y4[firstcount]);
                    System.out.println(Arrays.toString(y5));
                    
                }
                firstcount++;
            
        }
        System.out.println(Arrays.toString(y5));
        
    }
}
