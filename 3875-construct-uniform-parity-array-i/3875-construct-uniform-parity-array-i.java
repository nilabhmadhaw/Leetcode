class Solution {
    public boolean uniformArray(int[] nums1) {
            int EvenCount = 0;
            int OddCount = 0;
        for(int i=0;i<nums1.length;i++){
            if((nums1[i]&1) == 1){
                OddCount += 1;
            }
            else{
                EvenCount += 1;
            }
        }
        if(EvenCount == nums1.length){
            return true;
        }
        else if(OddCount == nums1.length){
            return true;
        }
        else{
                return true;
            }
        }
        }