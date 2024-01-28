public class sumLimit {
    public int sumLimit(int a, int b) {
        String str = Integer.toString(a + b);
        String str2 = Integer.toString(a);
        if(str.length() == str2.length()) {
          return a + b;
        }
        else {
          return a;
        }
    }
}
