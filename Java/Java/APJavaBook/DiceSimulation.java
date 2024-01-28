package APJavaBook;
import java.util.Random;
public class DiceSimulation {
    public static void main(String[] args) {
        DiceSimulation s1 = new DiceSimulation(10, 6);
        int endresult = s1.runSimulation();
        System.out.println("Your got a " + endresult + "% success");
        
    }
    private int numSampleSize;
    private int numFaces;
    public DiceSimulation(int numSamples, int faces) {
        numSampleSize = numSamples;
        numFaces = faces;
        
    }
    public int roll() {
        Random rollvalue = new Random();
        int result1 = rollvalue.nextInt(numFaces) + 1;
        return result1;

    }
    public int runSimulation() {
        DiceSimulation s1 = new DiceSimulation(10, 6);
        int counter = 0;
        //DiceSimulation s1 = new DiceSimulation(10, 6);
        for (int x = 0; x < numSampleSize; x++) {
            int roll1 = s1.roll();
            int roll2 = s1.roll();
            System.out.println(roll1);
            System.out.println(roll2);
            System.out.println("");
            if (roll1 == roll2) {
                counter++;
            }
        }
        counter = counter * 10;
        return (counter);
    }

    
}
