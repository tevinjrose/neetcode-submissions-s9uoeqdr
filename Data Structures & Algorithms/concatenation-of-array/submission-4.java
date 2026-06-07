class Solution {
    public int[] getConcatenation(int[] nums) {

        int numsLength = nums.length;

        int[] ans = new int[numsLength * 2];

        for(int i = 0; i < numsLength; i++) {
            ans[i] = nums[i];
            ans[i + numsLength] = nums[i];
        }

        return ans;
        
    }
}