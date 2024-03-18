class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //binary search from min=piles to max=max(piles)
        int r = 0, l = 1, k = 0;
        for(int i : piles){
            if(i > r) r = i;
        }

        while(l < r){
            k = (l + r) / 2;
            //compute if this speed is enough
            int totalHours = 0;
            for(int pile : piles){
                //round up division
                totalHours += (int) Math.ceil((double) pile / k);
            }
            if(totalHours <= h){
                r = k;
            }else{
                l = k + 1;
            }

        }
        return l;
    }
}