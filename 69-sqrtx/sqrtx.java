class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;

        int ans = 0;

        while(start <= end){
            int mid = end +(start - end)/2;

            long temp = (long) mid * mid;

            if(temp == x){
                return mid;
            }
            else if(temp < x){
                start = mid +1;
                ans = mid;
            }

            else{
                end = mid -1;

            }
            
        }
        return ans;
    }
}