public class twoChar {
    public String twoChar(String str, int index) {
        if (index < 0) {
          return str.substring(0, 2);
        }
        if (str.length() < index + 2) {
          return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}
