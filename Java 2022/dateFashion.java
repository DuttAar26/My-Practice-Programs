public class dateFashion {
    public int dateFashion(int you, int date) {
        if (you >= 8 || date >= 8) {
          if (you > 2) {
            if (date > 2) {
              return 2;
            }
          }
          
        }
        if (you <= 2 || date <= 2) {
          return 0;
        }
        return 1;
    } 
}
