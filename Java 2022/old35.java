public class old35 {
    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 != 0 || n % 3 != 0 && n % 5 == 0) {
          return true;
        }
        return false;
    }
}
