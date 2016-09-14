package leetcode_08_2016;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import util.TreeNode;

public class E_102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (root == null) return res;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        while(!q.isEmpty()) {
        	Queue<TreeNode> tmp = new LinkedList<TreeNode>(q);
        	List<Integer> list = new ArrayList<Integer>();
        	q.clear();
        	while(!tmp.isEmpty()) {
        		TreeNode n = tmp.poll();
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
        return res;
        
    }
}
