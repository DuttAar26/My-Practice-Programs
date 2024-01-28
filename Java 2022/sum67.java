public class sum67 {
    public int sum67(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int x = 0; x < nums.length; x++) {
          if (nums[x] == 6 && count == 0) {
            count = count + 1;
          }
          if (count == 0) {
            sum = sum + nums[x];
          }
          if (nums[x] == 7 && count == 1) {
            count = count - 1;
          }
          
        }
        return sum;
    }
}
