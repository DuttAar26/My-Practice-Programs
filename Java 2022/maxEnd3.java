public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        if (nums[0] >= nums[nums.length-1]) {
        nums[0] = nums[0];
        nums[1] = nums[0];
        nums[2] = nums[0];
        }
        else if (nums[0] <= nums[nums.length-1]) {
        nums[0] = nums[nums.length-1]; 
        nums[1] = nums[nums.length-1]; 
        nums[2] = nums[nums.length-1];
        }
        return new int[] { nums[0],nums[1],nums[2]};
    }
}
