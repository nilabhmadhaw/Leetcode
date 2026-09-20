class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for(int ch=0;ch<n;ch++){
            int index = s.charAt(ch) - 'a' + 1;
            int indexAlpha = 27-index;
            int product = indexAlpha * (ch+1) ;
            sum+=product;
        }
        return sum;
    }
}