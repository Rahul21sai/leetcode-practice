class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length;i++){
            ans[i] = nums[nums[i]];
        }

        // for(int i = 0; i < nums.length;i++){
        //     System.out.print(ans[i]);
        // }

        return ans;


        
        
    }
}