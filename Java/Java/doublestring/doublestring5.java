package doublestring;
import java.util.Scanner;
import java.util.Arrays;
public class doublestring5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1-10 Strings");
        String x = input.nextLine();
        int control = 0;
        int count2 = 0;
        String f = "";
        int hello = 0;
        int first = 0;
        int last = x.length();
        int i = 0;
        int e = 0;
        int counter = 0;
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
        int last4 = count + 1;
        int first5 = 0;
        String y[] = new String[count + 1];
        String y2[] = new String[count + 1];
        String y3[] = new String[count + 1];
        String y4[] = new String[count + 1];
        int first4 = 0;
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
        for (first4 = 0; first4 < first2; first4++) {
            for (int t2 = first4 + 1; t2 < first2; t2++) {
                if (y2[first4].equals(y2[t2])) {
                    count2 = count2 + 1;
                    if (count2 > 1) {
                        control = control + 1;
                        
                        
                    } else if (count2 == 1) {
                        y3[control] = y2[first4];
                        control = control + 1;
                        
                    }    
                } 
                else {
                    hello = hello + 1;
                    if (hello == 1) {
                        y3[first4] = y2[first4];
                        y3[t2] = y2[t2];
                        counter = counter + 1;
                        control = control + 1;
                        if (count2 > 0) {
                            count2 = 0;
                        }
                        count2 = count2 + 1;
                    } else {
                        break;
                    }
                }
                
            }   
        }
        System.out.println(Arrays.toString(y3));
        int first6 = 0;
        while (first5 < last4) {
            if (y3[first5] != null) {
                y4[first6] = y3[first5];
                first6++;
            }
            first5++;
        }
        System.out.println(Arrays.toString(y4));
    } 
}






