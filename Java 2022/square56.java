public class square56 {
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> (int) Math.pow(n, 2) + 10);
        nums.removeIf(n -> Integer.toString(n).charAt(Integer.toString(n).length()-1) == '5' || Integer.toString(n).charAt(Integer.toString(n).length()-1) == '6');
        return nums;
    }
}
