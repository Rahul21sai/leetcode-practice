/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        if(root == null) return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;
    }
    void helper(Node root,List<Integer> list){
        for(Node child : root.children){
            helper(child,list);
        }
        list.add(root.val);
    }
    
}