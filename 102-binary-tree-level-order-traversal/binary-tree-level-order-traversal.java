/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if(root == null){
        return list;
    }

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    while(!q.isEmpty()){
        int levelsize = q.size();

        List<Integer> currentlevel = new ArrayList<Integer>(levelsize);

        for(int i = 0; i < levelsize;i++){
            TreeNode currentnode = q.poll();
            currentlevel.add(currentnode.val);

            if(currentnode.left !=null){
                q.offer(currentnode.left);
            }
            if(currentnode.right !=null){
                q.offer(currentnode.right);
            }
        }
        list.add(currentlevel);


    }
    return list;

    }
}