class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] >= nums.length) return nums.length;
        for(int i=1; i<=nums.length; i++) {
            if(nums[nums.length-i] >= i && (nums.length-i-1 <0 || nums[nums.length-i-1] < i)) return i;
        }
        return -1;
    }
}