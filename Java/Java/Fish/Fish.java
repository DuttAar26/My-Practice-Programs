package Fish;

import Pet.Pet;

public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howdeep) {
        currentDepth = currentDepth + howdeep;
        System.out.println("Diving for " + howdeep + " feet");
        System.out.println("I'm at " + currentDepth + " feet below sea level");
        return currentDepth;


    }
    
}