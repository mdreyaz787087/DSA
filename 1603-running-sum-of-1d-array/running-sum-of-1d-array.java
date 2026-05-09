class Solution {
    public int[] runningSum(int[] nums) {
        int pre = nums[0]; // 
        for (int i = 1; i < nums.length; i++) {
            pre += nums[i];   
            nums[i] = pre;   
        }
        return nums;
    }
}
