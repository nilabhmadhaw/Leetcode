class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans ="";
        int n = s.length();
        int left = 0;
        int count = 0;
        for(int right=0;right<n;right++){
            if(s.charAt(right) == '1'){
                count++;
            }
            if(count == k){
                while(s.charAt(left) == '0'){
                    left++; 
                }  
                String candidate = s.substring(left, right+1);
                if(ans.equals("") || candidate.length() < ans.length()||
                  (candidate.length() == ans.length() &&
                   candidate.compareTo(ans)<0)){
                    ans = candidate;
            }
            left++;
            count--;
            }
        }
        return ans;
    }
}