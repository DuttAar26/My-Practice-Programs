package APJavaBook;
import java.util.Random;
public class DiceSimulation2 {
    private int numSampleSize;
    private int numFaces;
    public DiceSimulation2(int numSamples, int faces) {
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
        counter = (counter * 100) / numSampleSize;
        return (counter);
    }
}
