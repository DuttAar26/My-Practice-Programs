package JavaRoboticsClub;
import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static String input;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rock, Paper, or Scissors");
        Random r = new Random();
        input = sc.nextLine();
        int count = 0;
        RPS x = new RPS();
        while (count == 0) {
            int i = r.nextInt(3);
            if (i == 0 && input != "Rock") {
                x.Rock(input);
                count++;
            } else if (i == 1 && input != "Paper") {
                x.Paper(input);
                count++;
            } else if (i == 2 && input != "Scissors") {
                x.Scissors(input);
                count++;
            }
        }
    }
    public String Rock(String input) {
        if (input.equals("Rock")) {
            System.out.println("Rock equals rock, you tie");
        } else if (input.equals("Paper")) {
            System.out.println("Paper beats rock, you win");
        } else {
            System.out.println("Rock beats scissors, you lose");
        }
        return "";
    }
    public String Paper(String input) {
        if (input.equals("Paper")) {
            System.out.println("Paper equals paper, you tie");
        } else if (input.equals("Scissors")) {
            System.out.println("Scissors beats paper, you win");
        } else {
            System.out.println("Paper beats rock, you lose");
        }
        return "";
    }
    public String Scissors (String input) {
        if (input.equals("Scissors")) {
            System.out.println("Scissors equals scissors, you tie");
            
        } else if (input.equals("Rock")) {
            System.out.println("Scissors beats paper, you win");
        } else {
            System.out.println("Rock beats scissors, you lose");
        }
        return "";
    }
}
