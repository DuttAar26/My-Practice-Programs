public class sumDigits2 {
    public int sumDigits2(int n) {
        if(n == 0) {
          return 0;
        }   
        return n % 10 + sumDigits2(n / 10);
      }
}
