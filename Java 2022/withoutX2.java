public class withoutX2 {
    public String withoutX2(String str) {
        if (str.length() < 2) {
          return "";
        }
        if (str.substring(0,1).equals("x") || str.substring(1,2).equals("x")) {
          if (str.substring(0,1).equals("x") && str.substring(1,2).equals("x")) {
            return str.substring(2, str.length());
          }
          if (str.substring(0,1).equals("x")) {
            return str.substring(1, str.length());
          }
          if (str.substring(1, 2).equals("x")) {
            return str.substring(0,1) + str.substring(2, str.length());
          }
        }
        return str;
    }
}
