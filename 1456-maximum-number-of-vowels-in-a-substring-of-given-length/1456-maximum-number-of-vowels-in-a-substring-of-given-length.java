class Solution {
    public int maxVowels(String s, int k) {
        int count = 0; 
        for(int i=0;i<k;i++){
            if (isVowel(s.charAt(i))){
                count++;
            }
        }
        int max = count;
        for(int i=1;i<=s.length()-k;i++){
            if (isVowel(s.charAt(i - 1))) {
                count--;
            }

        if (isVowel(s.charAt(i + k - 1))) {
            count++;
        }
         max = Math.max(max,count);
        }
        return max;
    }
     private boolean isVowel(char c) {
        return c == 'a' ||
               c == 'e' ||
               c == 'i' ||
               c == 'o' ||
               c == 'u';
    }
}