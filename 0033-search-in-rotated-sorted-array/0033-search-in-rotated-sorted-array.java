class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return search(nums,target,start,end);
    }
    static int search(int[]nums,int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[start]<=nums[mid]){
            if(target< nums[mid] && target>=nums[start]){
                return search(nums,target,start,mid-1);
            }
            else{
                return search(nums,target,mid+1,end);
            }
        }
        if(target>nums[mid] && target<=nums[end]){
            return search(nums,target,mid+1,end);
        }
        else{
             return search(nums,target,start,mid-1);
        }
    }
}