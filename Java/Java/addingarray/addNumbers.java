package addingarray;
import java.util.Scanner;

public class addNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a list of 10 numbers");
        String numlist = input.nextLine();
        System.out.println("Type in one more number");
        String lastnum = input.nextLine();
        String[] array1 = numlist.split(",");
        boolean foundMatch = false;
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = i+1; j < array1.length; j++) {
                if (Integer.parseInt(array1[i]) + Integer.parseInt(array1[j]) == Integer.parseInt(lastnum)) {
                    System.out.println("The numbers " + array1[i] + " and " + array1[j] + " add up to " + lastnum);
                    foundMatch = true;
                }                 
            }
        }
        if (foundMatch == false) {
            System.out.println("Sorry, no two numbers from your list add up to the last number you gave.");     
        }
        
    } 
}
