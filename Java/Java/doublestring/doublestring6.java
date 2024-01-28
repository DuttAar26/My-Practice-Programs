package doublestring;
import java.util.Scanner;
import java.util.Arrays;
public class doublestring6 {
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
        while (first3 < last2) {
            if (x.charAt(first3) == ',') {
                count++;
            }
            first3++;
        }   
        int last4 = count + 1;
        int first5 = 0;
        int last5 = count + 1;
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
                    superhero = superhero + 1;
                    System.out.println("fIrSt4   " + first4);
                    System.out.println("t2   " + t2);
                    j = j + 1;
                    count2 = count2 + 1;
                    if (count2 > 1) {
                        System.out.println("FIRST4   " + first4);
                        System.out.println("t2   " + t2);
                        System.out.println("HELLO");
                        System.out.println("CONTROL " + control);
                        System.out.println("y[first4] = " + y2[first4]);           
                        System.out.println("y[t2] = " + y2[t2]);
                        
                        System.out.println(Arrays.toString(y3));
                        control = control + 1;
                        if (control2 == 0) {
                            System.out.println("Bye");
                            y3[first4] = y2[first4];
                            hello = 0;
                        } 
                        control2 = control2 + 1;                       
                        
                        
                    } else if (count2 == 1) {
                        System.out.println("hi");
                        
                        System.out.println(Arrays.toString(y3));
                        
                        control = control + 1;
                        System.out.println("first4   " + first4);
                        System.out.println("t2   " + t2);
                        System.out.println("first2  " + first2);
                        System.out.println("y[first4] = " + y2[first4]);           
                        System.out.println("y[t2] = " + y2[t2]);
                        if (control2 == 0) {
                            System.out.println("Bye");
                            y3[first4] = y2[first4];
                            hello = 0;
                        }
                        control2 = control2 + 1;
                        
                    }    
                } 
                else {
                    hello = hello + 1;
                    if (hello == 1) {
                        System.out.println("hello");
                        System.out.println("y[first4] = " + y2[first4]);           
                        System.out.println("y[t2] = " + y2[t2]);
                        System.out.println("first4   " + first4);
                        System.out.println("t2   " + t2);
                        y3[first4] = y2[first4];
                        y3[t2] = y2[t2];
                        counter = counter + 1;
                        control = control + 1;
                        System.out.println(Arrays.toString(y3));
                        
                        
                        
                        
                    } else {
                        if (t2 == first2 - 2 && y2[t2] != null) {
                            if (y2[t2] != y2[first4] && hello == 1) {
                                System.out.println("y[first4] = " + y2[first4]);           
                                System.out.println("y[t2] = " + y2[t2]);
                                System.out.println("HI 2");
                                y3[t2] = y2[t2];
                                System.out.println(Arrays.toString(y3));
                                v = v + 1;
                                if (count2 > 0) {
                                    count2 = 0;
                                }
                                

                            } else {
                                System.out.println("HI");
                                System.out.println("y[first4] = " + y2[first4]);           
                                System.out.println("y[t2] = " + y2[t2]);
                                System.out.println("break");
                                
                                if (yeet == 0) {
                                    control2 = 0;
        
                                }
                                yeet = yeet + 1;
                                if (control2 == 0) {
                                    System.out.println("Bye");
                                    y3[first4] = y2[first4];
                                    
                                }
                                if (count2 == 0) {
                                    y3[first4] = y2[first4];
                                }
                                control2 = control2 + 1;
                                
                                System.out.println(Arrays.toString(y3));
                                
                                 
                            }
                            

                            
                        } else {
                            System.out.println("y[first4] = " + y2[first4]);           
                            System.out.println("y[t2] = " + y2[t2]);
                            System.out.println("BREAK");
                            System.out.println(Arrays.toString(y3));
                            hey = hey + 1;
                            if (count2 == 0) {
                                y3[t2] = y2[t2];
                            }
                            
                            
                            if (t2 == first2 - 1 && first4 == t2 - 1) {
                                System.out.println("first4" + first4);
                                System.out.println("t2" + t2);
                                System.out.println("first2" + first2);
                                System.out.println("PORI");
                                System.out.println("y[first4] = " + y2[first4]);           
                                System.out.println("y[t2] = " + y2[t2]);
                                y3[first4] = y2[first4];
                                y3[t2] = y2[t2];
                                
                                System.out.println(Arrays.toString(y3));
                                if (hey > 1 && j < first2 / 2 && y2[first4] != y2[t2]) {
                                    System.out.println("pori");
                                    y3[first4] = y2[first4];
                                    y3[t2] = y2[t2];
                                    System.out.println(Arrays.toString(y3));
                                }
                            }
                            
                        }
                        
                        
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
        while (first7 < last5) {
            if (y4[first7] != null) {
                count3 = count3 + 1;
            }
            first7++;
        }
        String y5[] = new String[count3];
        if (count3 == 1) {
            y5[first8] = y4[first8];
            System.out.println(Arrays.toString(y5));
        }
        
    } 
}







