class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(String str : strs) {
            prefix = Fn(prefix, str);
        }

        return prefix;
    }

    public String Fn(String prefix, String str) {
        int len = 0;

        int i = 0;
        while(i < prefix.length() && i < str.length()) {
            if(prefix.charAt(i) == str.charAt(i)) {
                len++;
            }else {
                break;
            }

            i++;
        }

        return prefix.substring(0, len);
    }
}