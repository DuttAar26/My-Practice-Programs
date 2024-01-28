public class prefixAgain {
    public boolean prefixAgain(String str, int n) {
        if (str.length() == 2 && n == 1) {
          if (str.substring(0, 1).equals(str.substring(1, 2))) {
            return true;
          }
        }
        for (int x = n; x < str.length() - n; x++) {
          if (str.substring(0, n).equals(str.substring(x, x + n))) {
            return true;
          }
        }
        return false;
    }
}
