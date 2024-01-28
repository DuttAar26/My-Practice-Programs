package addingarray;
import java.util.Scanner;


public class addingarray2 {
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
        int counter = 1;
        int indexofsecond = 0;
        int indexoffirst = 0;
        int duplicatechecker = 0;
        while (firstnumcount < array1.length) {
            if (count < array1.length) {
                if (secondnumcount < array1.length) {
                    if (Integer.parseInt(array1[firstnumcount]) + Integer.parseInt(array1[secondnumcount]) == Integer.parseInt(lastnum) && indexoffirst != indexofsecond) {
                        System.out.println("The numbers " + array1[firstnumcount] + " and " + array1[secondnumcount] + " add up to " + lastnum);
                        duplicatechecker++;
                    } else {
                        
                    }
                    secondnumcount++;
                    indexofsecond++;
                }
                else if (secondnumcount == array1.length) {
                    indexofsecond = counter;
                    firstnumcount++;
                    secondnumcount = counter;
                    counter++;
                    count++;
                    indexoffirst++; 
                }
            } else {
                count = 0;
            }
            
            
            
        }
        if (duplicatechecker == 0) {
            System.out.println("Sorry, no two numbers from your list add up to the last number you gave.");
        }
            
    }
}

