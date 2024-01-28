package Pet;
public class Pet {
    int age;
    float weight;
    float height;
    String color;
    public void sleep() {
        System.out.println("Good night, see you tomorrow");
    
    }
    public void eat() {
        System.out.println("Im so hungry I want nachos.");

    }
    public String say(String aWord) {
        String petResponse = "OK!! OK!! " +aWord;
            return petResponse;
    }







}   