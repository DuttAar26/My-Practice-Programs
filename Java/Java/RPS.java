import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random Rand = new Random();
        System.out.println("Please enter rock, paper, or scissors.");
        String value = input.nextLine();
        // selects a random rock, paper, or scissors
        // rock = 0, paper = 1, scissors = 2
        int random = Rand.nextInt(3);
        if (random == 0) {
            System.out.println("The opponent pulls out a rock...");
            if (value.equals("rock")) {
                System.out.println("You tied! Try harder next time!");
            }
            else if (value.equals("paper")) {
                System.out.println("You won! Nice work!");
            }
            else if (value.equals("scissors")) {
                System.out.println("You lost :( But don't give up yet!");
            }
        }
        else if (random == 1) {
            System.out.println("The opponent pulls out a paper...");
            if (value.equals("rock")) {
                System.out.println("You lost :( But don't give up yet!");
            }
            else if (value.equals("paper")) {
                System.out.println("You tied! Try harder next time!");
            }
            else if (value.equals("scissors")) {
                System.out.println("You won! Nice work!");
            }
        }
        else if (random == 2) {
            System.out.println("The opponent pulls out a pair of scissors...");
            if (value.equals("rock")) {
                System.out.println("You won! Nice work!");
            }
            else if (value.equals("paper")) {
                System.out.println("You lost :( But don't give up yet!");
            }
            else if (value.equals("scissors")) {
                System.out.println("You tied! Try harder next time!");
            }

        }
        else {
            System.out.println("HI");
            System.out.println(random);
        }
        
    }
}
