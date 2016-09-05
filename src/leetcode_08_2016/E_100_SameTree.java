package leetcode_08_2016;

import util.TreeNode;

public class E_100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	// if 2 trees are null
    	if(p == null && q == null) {
    		return true;
    	} 
    	
    	// if only 1 tree is null
    	if(p == null || q == null) {
    		return false;
    	} 
    	
    	if(p.val != q.val) {
    		return false;
    	}
    	
    	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);    	
    }
}
