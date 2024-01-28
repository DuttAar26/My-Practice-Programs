public class sum13 {
    public int sum13(int[] nums) {
        int sum = 0;
        int i = 0;
          
        while(i < nums.length) {
            if(nums[i] == 13) {
                i += 2;
            } else {
                sum += nums[i];
                i++;
            }
        }                                      
        return sum;
    }
}
