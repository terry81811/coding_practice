package leetcode_08_2016;

import util.TreeNode;

public class E_101_SymmetricTree {
	
	//recursive
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        else return isTwoSymmetric(root.left, root.right);
    }
    
    public boolean isTwoSymmetric(TreeNode p, TreeNode q) {
    	if(p == null && q == null) return true;
    	else if(p == null) return false;
    	else if(q == null) return false;
    	else if(p.val != q.val) return false;
    	else return isTwoSymmetric(p.left, q.right) && isTwoSymmetric(p.right, q.left);
    }
}
