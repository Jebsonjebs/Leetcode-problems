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
    static int  result=0;
    public static int findMax(TreeNode root){   
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(findMax(root.left), findMax(root.right)));
    } 

    public static int findMin(TreeNode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val, Math.min(findMin(root.left), findMin(root.right)));
    }

    public void subTreeMinMaxDiff(TreeNode root) {
        int rootValue=root.val;
        int min=findMin(root);
        int max=findMax(root);
       // System.out.println(min+" "+max);
        result=Math.max(result ,Math.max(Math.abs(rootValue-min),Math.abs(rootValue-max)) );
        //System.out.println("Res"+result);
        
    }
    public void inorder(TreeNode root) {
        if(root==null)
        return;
       
       subTreeMinMaxDiff(root);
       inorder(root.left);  
       inorder(root.right);
      
    }
    public int maxAncestorDiff(TreeNode root) {
       result=0;
       inorder(root);
       return result;
    }
}