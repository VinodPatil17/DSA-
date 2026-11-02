class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int first = 0;

        for(int sec = 0; sec < n; sec++){
            if(nums[sec] != 0){
                int temp = nums[first];
                nums[first] = nums[sec];
                nums[sec] = temp;
                first++;
            }
        }
    }
}