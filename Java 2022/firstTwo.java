public class firstTwo {
    public String firstTwo(String str) {
        if (str.length() < 2) {
          return str;
        }
        return str.substring(0, 2);
    }
}
