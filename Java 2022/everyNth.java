public class everyNth {
    public String everyNth(String str, int n) {
        String x = "";
        for (int i = 0; i < str.length(); i = i + n) {
          x = x + str.charAt(i);
        }
        return x;
    }
}
