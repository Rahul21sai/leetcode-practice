class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Map<Integer,String> st = new HashMap<>();
        
        for(int i = 0; i < names.length;++i){
            st.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < names.length / 2; ++i) {
            int temp = heights[i];
            heights[i] = heights[names.length - 1 - i];
            heights[names.length - 1 - i] = temp;
        }

        for (int i = 0; i < names.length; ++i) {
            names[i] = st.get(heights[i]);
        }

        return names;
    }
}