public class countEvens {
    public int countEvens(int[] nums) {
        int count = 0;
        for (int x = 0; x < nums.length; x++) {
          if (nums [x] % 2 == 0) {
            count++;
          }
        }
        return count;
    }
}
