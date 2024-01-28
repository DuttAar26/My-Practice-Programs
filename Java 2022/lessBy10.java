public class lessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        if (a <= b - 10) {
          return true;
        }
        if (b <= a - 10) {
          return true;
        } 
        if (c <= a - 10) {
          return true;
        }
        if (c <= b - 10) {
          return true;
        }
        if (a <= c - 10) {
          return true;
        }
        if (b <= c - 10) {
          return true;
        }
        return false;
    }
}
