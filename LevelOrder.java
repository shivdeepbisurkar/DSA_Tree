/**
 * 
 *      Level Order Traversal
 * 
 * 
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
class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();// Queue used store child of any node 
        List<List<Integer>> qlist=new ArrayList<List<Integer>>();//result list
        if(root==null) return qlist;
        queue.offer(root);
        while(!queue.isEmpty()){
            int length=queue.size();
            List<Integer> innerlist=new ArrayList<Integer>();
            for(int i=0;i<length;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                innerlist.add(queue.poll().val);
            }
            qlist.add(innerlist);
        }
        return qlist;
    }
}