public class lastChars {
    public String lastChars(String a, String b) {
        if (a == "" && b == "") {
          return "@@";
        }
        if (a == "") {
          return "@" + b.substring(b.length() - 1, b.length());
        }
        if (b == "") {
          return a.substring(0, 1) + "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1, b.length());
    }
}
