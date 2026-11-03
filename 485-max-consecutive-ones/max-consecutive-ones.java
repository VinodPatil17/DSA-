class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int oldCount = 0;
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                oldCount = Math.max(oldCount, count);
                count = 0;
            }
        }

        return Math.max(count, oldCount);
    }
}