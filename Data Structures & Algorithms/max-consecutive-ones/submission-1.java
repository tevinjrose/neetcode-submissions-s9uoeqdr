class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;

        //Time complexity is O(N), space complexity is O(1)

        
    }
}