public class countHi3 {
    public int countHi3(String str) {
        if(str.length() < 2) {
          return 0;
        }
        if(str.substring(0, 2).equals("hi")) {
          return 1 + countHi3(str.substring(2));
        }
        return countHi3(str.substring(1));
      }
}
