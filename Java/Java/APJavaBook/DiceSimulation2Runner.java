package APJavaBook;
public class DiceSimulation2Runner {
    public static void main(String[] args) {
        DiceSimulation DiceSimulation2 = new DiceSimulation(10, 6);
        int endresult = DiceSimulation2.runSimulation();
        System.out.println("Your got a " + endresult + "% success");
        
    }
    
    

    
}

