public class comboString {
    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
          return b + a + b;
        }
        if (b.length() > a.length()) {
          return a + b + a;
        }
        return "";
    }
      
}
