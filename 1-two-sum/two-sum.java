class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]= ans[1] = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            int num = nums[i];
            int moreneeded = target - num;
            if(map.containsKey(moreneeded)){
                ans[0] = map.get(moreneeded);
                ans[1] = i; 
            }
            map.put(nums[i],i);

        }
        return ans;
    }
}