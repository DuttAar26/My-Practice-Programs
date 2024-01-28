public class countXX {
    int countXX(String str) {
        int count = 0;
        for (int x = 0; x < str.length() - 1; x++) {
          if (str.substring(x, x + 2).equals("xx")) {
            count++;
          }
        }
        return count;
    }
}
