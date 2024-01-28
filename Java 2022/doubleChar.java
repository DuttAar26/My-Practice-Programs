public class doubleChar {
    public String doubleChar(String str) {
        String x = "";
        for (int i = 0; i <=str.length()-1;i++) {
           x += str.charAt(i);
           x += str.charAt(i); 
        }
      return x;
    }
}
