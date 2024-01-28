public class conCat {
    public String conCat(String a, String b) {
        if (a.equals("") || b.equals("")) {
          return a + b;
        }
        if (a.substring(2, 3).equals(b.substring(0, 1))) {
          return a.substring(0, 2) + b;
        }
        return a + b;
    }
}
