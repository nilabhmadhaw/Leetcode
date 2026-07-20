class Solution {
    public int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int currheight = 0;
        for(int i = 0; i<gain.length; i++){
            currheight += gain[i];
            if(currheight > highestAltitude){
                highestAltitude = currheight;
            }

        }
        return highestAltitude;
    }
}