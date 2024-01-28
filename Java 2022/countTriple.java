public class countTriple {
    public int countTriple(String str) {
        int count = 0;
        for (int x = 0; x < str.length() - 2; x++) {
          if (str.substring(x, x + 1).equals(str.substring(x + 1, x + 2)) && str.substring(x + 1, x + 2).equals(str.substring(x + 2, x + 3))) {
            count++;
          }
        }
        return count;
    }
}
