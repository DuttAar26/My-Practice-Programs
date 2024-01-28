public class startHi {
    public boolean startHi(String str) {
        if (str.length() >= 2) {
          if (str.substring(0, 2).equals("hi")) {
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
        
    }
}
