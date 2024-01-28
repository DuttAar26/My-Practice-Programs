public class hasBad {
    public boolean hasBad(String str) {
        if (str.equals("bad")) {
          return true;
        }
        if (str.length() <= 3) {
          return false;
        }
        if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
          return true;
        }
        return false;
    }
}
