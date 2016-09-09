package leetcode_08_2016;

import util.TreeNode;

public class E_235_LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p == q) return p;
        
        if((root.val - p.val) * (root.val - q.val) <= 0) {
        	return root;
        } else if(root.val < p.val && root.val < q.val) {
        	return lowestCommonAncestor(root.right, p, q);
        } else {
        	return lowestCommonAncestor(root.left, p, q);        	
        }
    }
}
