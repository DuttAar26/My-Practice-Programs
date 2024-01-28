public class max1020 {
    public int max1020(int a, int b) {
        if (a >= 10 && a <= 20) {
          if (b >= 10 && b <= 20) {
            if (b > a) {
              return b;
            } 
          }
          return a;
        } 
        if (b >= 10 && b <= 20) {
          return b;
        }
        return 0;
    } 
}
