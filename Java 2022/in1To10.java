public class in1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
          if (n <= 1 || n >= 10) {
            return true;
          }
          return false;
        }
        if (n >= 1 && n <= 10) {
          return true;
        }
        return false;
    }
}
