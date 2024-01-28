public class stringSplosion {
    public String stringSplosion(String str) {
        String i = "";
        for (int x = 0; x < str.length() + 1; x++) {
          i = i + str.substring(0, x);
        }
        return i;
    }
}
