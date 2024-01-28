public class stringE {
    public boolean stringE(String str) {
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
          char j = str.charAt(i);
          if (j == 'e') {
            x = x + 1;
          }
        }
        if (x >= 1 && x <= 3) {
          return true;
        }
        return false;
    }
      
}
