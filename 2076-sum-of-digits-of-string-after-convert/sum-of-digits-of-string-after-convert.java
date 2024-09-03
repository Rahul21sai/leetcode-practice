class Solution {
    public int getLucky(String s, int k) {
        StringBuilder converted = new StringBuilder();
        
        // Step 1: Convert string to numbers
        for (char c : s.toCharArray()) {
            converted.append(c - 'a' + 1);
        }
        
        String num = converted.toString();
        
        // Step 2: Perform k transformations
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (char digit : num.toCharArray()) {
                sum += digit - '0';
            }
            num = String.valueOf(sum);
        }
        
        return Integer.parseInt(num);
    }
}