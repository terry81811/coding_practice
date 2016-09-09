package leetcode_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

public class E_107_BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	if(root == null) {
    		return res;
    	}
    	
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.offer(root);
    	
    	
    	while(!q.isEmpty()) {
    		List<Integer> list = new ArrayList<Integer>();
        	Queue<TreeNode> tmpQ = new LinkedList<TreeNode>(q);
        	q.clear();
    		while(!tmpQ.isEmpty()) {
    			TreeNode n = tmpQ.poll();
        		list.add(n.val);
        		if(n.left != null) {
        			q.offer(n.left);
        		}
        		if(n.right != null) {
        			q.offer(n.right);
        		}
    		}
    		res.add(list);
    	}
        	
    	Collections.reverse(res);
    	return res;
    	
    }
    
    
    // smart recursive 
    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	
    	int level = 0;
    	dfs(res, level, root);
    	
    	Collections.reverse(res);    	
    	return res;
    }
    
    public void dfs(List<List<Integer>> res, int level, TreeNode root) {
    	if(root == null) return;
    	if(level >= res.size()) {
    		res.add(new ArrayList<Integer>());
    	}
    	res.get(level).add(root.val);
    	dfs(res, level+1, root.left);
    	dfs(res, level+1, root.right);
    }
    
}
