class Solution {
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        int e = graph[0].length;
        int[] color = new int[v];

        for(int i = 0; i < v;i++){
            color[i] = -1;
        }

        for(int i = 0 ; i < v; i++){
            if(color[i] == -1){
                if(dfs(i,0,color,graph) == false){
                    return false;
                }
            }
        }
        return true;


        
    }

    private boolean dfs(int node, int col, int[] color, int[][] graph){
        color[node] = col;

        int[] n = graph[node];

        for(int n1 : n){
            if(color[n1] == -1){
                if(dfs(n1,1-col,color,graph)== false){
                    return false;
                }
            }
            else if(color[n1] == col){
                return false;
            }

        }
        return true;

    }
    
}