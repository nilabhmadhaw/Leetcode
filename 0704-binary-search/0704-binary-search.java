class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target, 0, nums.length-1);
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        int mid = start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(nums[mid] == target){
            return mid;
        }
        else if(target>nums[mid]){
            return binarySearch(nums, target, mid+1, end);
        }
        else{
            return binarySearch(nums, target, start, mid-1);
        }
    }
}