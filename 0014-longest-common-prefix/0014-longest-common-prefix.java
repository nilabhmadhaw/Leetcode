class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String left = strs[0];
        String right = strs[strs.length-1];
        int index = 0;
        while(index < left.length() && index < right.length()){
            if(left.charAt(index) == right.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return index==0?"":left.substring(0,index);
    }
}