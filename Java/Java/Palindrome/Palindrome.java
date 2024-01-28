package Palindrome;
import java.util.Scanner;
import javax.sql.ConnectionEvent;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String palindrome = input.nextLine();
        palindrome = palindrome.toLowerCase();
        System.out.println("You entered "+ palindrome);
        // Closing The Scanner Object
        input.close();
        int first = 0;
        int last = palindrome.length() - 1;
        while (first < last) {
            if (palindrome.toCharArray()[first] == palindrome.toCharArray()[last]) {
                first = first + 1;
                last = last - 1;
                

            } else {
                System.out.println("This isnt a palindrome");
                break;
            }
        }
        if (first >= last) {
            System.out.println("This is a palindrome");
        }
        


        
    }
}