package JavaRoboticsClub;

public class FirstProgram {
    public static void main (String[] args) {
        System.out.println("Hello");

        double val = 0.0001;

        System.out.println(val);

        book book = new book();
        System.out.println(book.coverColor);
        System.out.println(book.IsBookOpen);

        book.openBook();

        

    }
}
