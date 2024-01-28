public class arrayFront {
    public boolean arrayFront9(int[] nums) {
        int i = 0;
        while(i < nums.length && i < 4) {
          if(nums[i] == 9) {
            return true;
          }
          i++;
        }
        return false;
    }
}
