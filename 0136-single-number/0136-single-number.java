class Solution {
    public int singleNumber(int[] nums) {
        int count = 0 ;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                count = nums[i];
                return count;
            }
        }
        return nums[nums.length-1];
    }
}