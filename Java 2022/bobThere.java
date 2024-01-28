public class bobThere {
    public boolean bobThere(String str) {
        int len = str.length();
        String b = "b";
        if (len < 3) {
          return false;
        }
        for (int i = 0; i < len - 2; i++) {
          if (b.compareTo(str.substring(i, i + 1)) == 0 && b.compareTo(str.substring(i + 2, i + 3)) == 0) {
            return true;
          }
        }
        return false;
    }
}
