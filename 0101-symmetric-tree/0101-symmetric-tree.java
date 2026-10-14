/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if (root == null) return true;
        
        // Check if left and right subtrees are mirrors of each other]]
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // Base case 1: Both nodes are null -> symmetric
        if (t1 == null && t2 == null) return true;
        
        // Base case 2: One is null, the other isn't -> not symmetric
        if (t1 == null || t2 == null) return false;
        
        
        // 1. Values must be equal
        // 2. Left child of t1 must mirror Right child of t2
        // 3. Right child of t1 must mirror Left child of t2
        return (t1.val == t2.val) 
            && isMirror(t1.left, t2.right) //t1's left and t2's right
            && isMirror(t1.right, t2.left); //t1's right and t2's left
    }
}