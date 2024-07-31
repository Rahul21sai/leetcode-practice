class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;

        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1; i<=n;i++){
            int total_w = 0;
            int max_height = 0;

            for(int j = i; j >0;--j){
                total_w += books[j-1][0];
                if(total_w > shelfWidth){
                    break;
                }
                max_height = Math.max(max_height,books[j-1][1]);
                dp[i] = Math.min(dp[i],dp[j-1] + max_height);
            }
        }
        return dp[n];
    }
}