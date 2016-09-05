package leetcode_08_2016;

import util.TreeNode;

public class E_226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        
    	// root is null
    	if(root == null) {
    		return null;
    	} else {
    		TreeNode temp = root.right;
    		root.right = root.left;
    		root.left = temp;
    		invertTree(root.left);
    		invertTree(root.right);
    	}
    	return root;
    }
}
