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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));
        List<Double> returnList = new ArrayList<Double>();
        while (queue.size() > 0){
            int rowSize = queue.size();
            double rowTotal = 0;
            for (int i = 0; i < rowSize; i ++){
                TreeNode current = queue.poll();
                rowTotal += current.val;
                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
            returnList.add(rowTotal/rowSize);
        }
        return returnList;
    }

}
