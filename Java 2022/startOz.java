public class startOz {
    public String startOz(String str) {
        if (str.length() < 2) {
          return str;
        }
        if (str.substring(0, 2).equals("oz")) {
          return "oz";
        } else if (str.substring(0, 1).equals("o")) {
          return "o";
        } else if (str.substring(1, 2).equals("z")) {
          return "z";
        }
        return "";
    }
}
