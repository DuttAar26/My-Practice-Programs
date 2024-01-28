public class stringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        int length = 0;
        if (a.length() > b.length()) {
          length = b.length();
        } else {
          length = a.length();
        }
        
        for (int x = 0; x < length - 1; x++) {
          if (a.substring(x, x + 2).equals(b.substring(x, x + 2))) {
            count++;
          }
        }
        return count;
    }
}
