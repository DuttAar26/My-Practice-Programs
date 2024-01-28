public class stringTimes {
    public String stringTimes(String str, int n) {
        String i = "";
        if (n == 0) {
          return "";
        }
        for (int x = 0; x < n; x++) {
          i = i + str;
        }
        return i;
    }
}
