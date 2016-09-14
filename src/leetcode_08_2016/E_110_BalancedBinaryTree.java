package leetcode_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

public class E_110_BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
    	if(root == null) return true;
    	if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) return false;
    	else {
    		return isBalanced(root.left) && isBalanced(root.right);
    	}
    	
    }
    
    public int getHeight(TreeNode root) {
    	if(root == null) return 0;
    	return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
	
	public boolean isBalanced3(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left == null) {
        	if(root.right.right != null || root.right.left != null) return false;
        } else if(root.right == null) {
        	if(root.left.right != null || root.left.left != null) return false;
        }
        return isBalanced3(root.left) && isBalanced3(root.right);
    }
    
    public boolean isBalanced2(TreeNode root) {
        if(root == null) return true;
    	int level = 0;
    	List<Integer> h = new ArrayList<Integer>();
    	
    	dfs(root, h, level);
    	int max = Collections.max(h);
    	int min = Collections.min(h);
    	
    	System.out.println(h);
    	return (max - min) < 2;
    }
    
    public void dfs(TreeNode root, List<Integer> h, int level) {
    	if(root == null) {
    		h.add(level);
    	} else {
    		dfs(root.left, h, level + 1);
    		dfs(root.right, h, level + 1);    		
    	}
    }
    
    
    public static void main(String[] args) {
    	E_110_BalancedBinaryTree o = new E_110_BalancedBinaryTree();
    	TreeNode a = new TreeNode(1);
    	TreeNode b = new TreeNode(2);
    	TreeNode c = new TreeNode(2);
    	TreeNode d = new TreeNode(3);
    	TreeNode e = new TreeNode(3);
    	TreeNode f = new TreeNode(4);
    	TreeNode g = new TreeNode(4);
    	a.left = b;
    	a.right = c;
    	b.left = d;
    	b.right = e;
    	d.left = f;
    	d.right = g;
    	
    	
    	o.isBalanced2(a);
    }
}
