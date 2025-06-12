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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inOrderBst(root,arr);
        int temp=arr.get(0);
        int count=0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>temp){
                temp=arr.get(i);
                count+=1;
            }
        }
        if(count==arr.size()-1)return true;
        else return false;

    }
    static void inOrderBst(TreeNode root,ArrayList<Integer> arr){
        if(root == null)return;
        inOrderBst(root.left,arr);
        arr.add(root.val);
        inOrderBst(root.right,arr);
    }
}