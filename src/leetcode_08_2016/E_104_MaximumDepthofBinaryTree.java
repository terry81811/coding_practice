package leetcode_08_2016;

import util.TreeNode;

public class E_104_MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) {
        	return 0;
        } else {
        	return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
