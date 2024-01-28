public class repeatEnd {
    public String repeatEnd(String str, int n) {
        String newStr = "";
        for (int x = 0; x < n; x++) {
          newStr = newStr + str.substring(str.length() - n, str.length());
        }
        return newStr;
    }
}
