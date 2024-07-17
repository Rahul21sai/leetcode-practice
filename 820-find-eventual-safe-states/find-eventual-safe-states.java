// // class Solution {
//     public List<Integer> eventualSafeNodes(int[][] graph) {

//         int V = graph.length;
//         List<List<Integer>> adj = new ArrayList<>();

//         for(int i = 0 ; i < V;i++){
//             List<Integer> list = new ArrayList<>();

//             for(int j = 0 ; j < graph[i].length;j++){
//                 list.add(graph[i][j]);
//             }
//             adj.add(list);
//         }
//         int[] vis = new int[V];
//         int[] pathvis = new int[V];
//         int[] check = new int[V];
        
//         for(int i = 0 ; i < V ; i++){
//             if(vis[i] == 0){
//                 dfs(i,vis,pathvis,adj,check);
//             }
//         }
//         List<Integer> safenodes = new ArrayList<>();
        
//         for(int i = 0 ; i< V;i++){
//             if(check[i] == 1){
//                 safenodes.add(i);
//             }
            
//         }
//         return safenodes;
//     }
//     private boolean dfs(int node, int[] vis, int[] pathvis, List<List<Integer>> adj, int[] check){
//         vis[node] = 1;
//         pathvis[node] = 1;
//         check[node] = 0;
//         // traverse for the adjacent node
//         for(int it: adj.get(node)){
//            if(vis[it] == 0){
//                if(dfs(it,vis,pathvis,adj,check) == true){
//                    return true;
//                }
//            } 
//            else if(pathvis[it] == 1){
//                return true;
//            }
//         }
//         check[node] = 1;
//         pathvis[node] = 0;
//         return false;
        
//     }
// }

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int V = graph.length;
        int[] vis = new int[V];
        int[] pathvis = new int[V];
        int[] check = new int[V];
        
        for(int i = 0 ; i < V ; i++){
            if(vis[i] == 0){
                dfs(i,vis,pathvis,graph,check);
            }
        }
        List<Integer> safenodes = new ArrayList<>();
        
        for(int i = 0 ; i< V;i++){
            if(check[i] == 1){
                safenodes.add(i);
            }
            
        }
        return safenodes;
    }
    private boolean dfs(int node, int[] vis, int[] pathvis, int[][]graph, int[] check){
        vis[node] = 1;
        pathvis[node] = 1;
        check[node] = 0;
        // traverse for the adjacent node
        for(int it: graph[node]){
           if(vis[it] == 0){
               if(dfs(it,vis,pathvis,graph,check) == true){
                   return true;
               }
           } 
           else if(pathvis[it] == 1){
               return true;
           }
        }
        check[node] = 1;
        pathvis[node] = 0;
        return false;
        
    }
}
