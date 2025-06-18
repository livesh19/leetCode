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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int num = findHeight(root);
        if(num==-1)return false;
        else return true;
    }
    public int findHeight(TreeNode node){

        if(node==null){
            return 0;
        }
        int lh=findHeight(node.left);
        int rh=findHeight(node.right);
        if(lh==-1 || rh==-1){
            return -1;
        }
        if(Math.abs(rh-lh)>1) return -1;

        return 1+Math.max(lh,rh);

    }
}