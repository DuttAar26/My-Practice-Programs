public class factorial {
    public int factorial(int n) {
        int sum = 1;
        while (n > 0) {
          sum = sum * n;
          n = n - 1;
        }
        return sum;
    }
}
