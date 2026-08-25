class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int num = k;
        for(int i=1;i<=n;i++){
            num = k * i;
            boolean found = false;
            for(int x : nums){
                if(x == num){
                    found = true;
                    break;
                }
            }
             if(!found){
                    return num;
                }

        }
        return (n+1)*k;
    }
}