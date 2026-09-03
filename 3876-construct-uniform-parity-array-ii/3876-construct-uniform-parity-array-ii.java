class Solution {
    public boolean uniformArray(int[] nums1) {
        int countEven = 0;
        int countOdd = 0;
        for(int i=0;i<nums1.length;i++){
            if((nums1[i] & 1)==1){
                countOdd++;
            }
            else{
                countEven++;
            }
        }
        if(countEven == nums1.length){
            return true;
        }
        else if(countOdd == nums1.length){
            return true;
        }
        else{
            int minimum = nums1[0];
            for(int i=1;i<nums1.length;i++){
                if(nums1[i]< minimum){
                    minimum = nums1[i];
                }
                    }
                if((minimum & 1) == 1){
                    return true;
                }
                else{
                    return false;
                }
        }
}
}
