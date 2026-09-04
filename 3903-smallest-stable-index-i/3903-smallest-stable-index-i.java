class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int left_Max  = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int right_Max = Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                left_Max  = Math.max(left_Max,nums[j]); 
            }
            for(int j=i;j<nums.length;j++){
                right_Max = Math.min(right_Max,nums[j]);
            }
            int instability = left_Max - right_Max;
             if(instability<=k){
                return i;
              }
        }
        return -1;
    }
}