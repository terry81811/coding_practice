package leetcode_08_2016;

import java.util.ArrayList;
import java.util.List;

import util.TreeNode;

public class E_257_BinaryTreePaths {
	List<String> res = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
    	
    	if(root == null) return res;
    	
    	dfs(res, root, "");
    	
    	
    	return res;
        
    }
    
    public void dfs(List<String> res, TreeNode root, String path) {
    	if(root == null) return;
    	if(root.left == null && root.right == null) {
    		path = path + root.val;
    		res.add(path);
    		return;
    	}
    	if(root.left != null) {
    		dfs(res, root.left, path + root.val + "->");
    	}
    	if(root.right != null) {
    		dfs(res, root.right, path + root.val + "->");
    	}
    }
}
