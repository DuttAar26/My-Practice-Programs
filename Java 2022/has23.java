public class has23 {
    public boolean has23(int[] nums) {
        for (int x = 0; x < nums.length; x++) {
          if (nums[x] == 2 || nums[x] == 3) {
            return true;
          }
        }
        return false;
    }
}
