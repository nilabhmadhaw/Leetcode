class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        while(i < n){
            int correct = nums[i]-1;
            if(nums[i]!= nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1){
                result.add(nums[i]);
            }
        }
        return result;
    }
}