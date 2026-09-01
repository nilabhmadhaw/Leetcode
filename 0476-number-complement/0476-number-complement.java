class Solution {
    public int findComplement(int num) {
        int ans = 0;
        int base = 1;
        while(num>0){
        int last = num & 1;
        last = last ^ 1;
        ans += last * base;
        base =  base * 2;
        num = num>>1;
        }
        return ans;
    }
}