package JavaRoboticsClub;

public class book {
    
    int pageCount = 2000;
    String coverColor = "Brown";
    boolean isHardCover = true;
    String author = "Jack Miles";
    String publisher = "Norton";

    Boolean IsBookOpen = false;

    void openBook() {
        IsBookOpen = true;

    }

    void closeBook() {
        IsBookOpen = false;
    }
}
