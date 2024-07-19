class pair{
    String first;
    int second;
    pair(String first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(beginWord,1));
        Set<String> st = new HashSet<>(wordList);
        
        
        st.remove(beginWord);

        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;

            q.remove();
            if(word.equals(endWord) == true){
                return steps;
            }

            for(int i = 0; i < word.length();i++){
                for(char ch = 'a'; ch <='z';ch++){
                    char arr[] = word.toCharArray();
                    arr[i] = ch;
                    String replacedword = new String(arr);

                    if(st.contains(replacedword) == true){
                        st.remove(replacedword);
                        
                        q.add(new pair(replacedword,steps+1));
                    }
                }
            }
        }
        return 0;
        
    }
}