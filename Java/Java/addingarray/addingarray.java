package addingarray;
import java.util.Scanner;
public class addingarray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a list of 10 numbers");
        String numlist = input.nextLine();
        System.out.println("Type in one more number");
        String lastnum = input.nextLine();
        String[] array1 = numlist.split(",");
        int firstnumcount = 0;
        int secondnumcount = 0;
        int count = 0;
        
        while (firstnumcount < array1.length) {
            if (count < array1.length) {
                if (secondnumcount < array1.length) {
                    if (Integer.parseInt(array1[firstnumcount]) + Integer.parseInt(array1[secondnumcount]) == Integer.parseInt(lastnum)) {
                        System.out.println("The numbers " + array1[firstnumcount] + " and " + array1[secondnumcount] + " add up to " + lastnum);
                        
                        //break;
                    } else {
                        
                    }
                    secondnumcount++;
                }
                else if (secondnumcount == array1.length) {
                    firstnumcount++;
                    secondnumcount = 0;
                    count++;
                }
            } else {
                count = 0;
            }
        }
            
            
            
            
            
        
        
        

    }
}
