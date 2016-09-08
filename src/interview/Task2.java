package interview;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
	
	public class TreeNode {
		public TreeNode parent;
		public String name;
		public List<TreeNode> children;
		public TreeNode() {
			this.children = new ArrayList<TreeNode>();
		}	
	}
	
    public int solution(String S) {
        // write your code in Java SE 8
    	
    	if(S.length() == 0) return 0;
    	
    	int result = 0;
    	String[] lines = S.split("\n");
    	
    	TreeNode root = new TreeNode();
    	root.parent = null;
    	
    	TreeNode curNode = root;
    	TreeNode curParent = null;
    	int curLevel = -1;

    	for(int i=0; i<lines.length; i++) {
    		String s = lines[i];
    		int indent = countSpaces(s);
    		if(indent > curLevel) {
    			TreeNode t = new TreeNode();
    			t.name = s.replace(" ", "");
    			t.parent = curNode;
    			
    			curParent = curNode;
    			curNode = t;    	    			
    			curParent.children.add(t);
    			
    			
    			if((s.contains(".jpg") || s.contains(".png")) || s.contains(".gif")) {
    				result += getPathLength(t);
    			}
    			
    			
    		} else if(indent == curLevel) {
    			TreeNode t = new TreeNode();
    			t.name = s.replace(" ", "");
    			t.parent = curParent; 
    			
    			curNode = t;
    			curParent.children.add(t);

    			if((s.contains(".jpg") || s.contains(".png")) || s.contains(".gif")) {
    				result += getPathLength(t);
    			}    			
    			
    		} else if(indent < curLevel) {
    			TreeNode t = new TreeNode();
    			t.name = s.replace(" ", "");
    			t.parent = curParent; 
    			
    			curNode = t;
    			curParent = curNode.parent.parent;
    			curParent.children.add(t);

    			if((s.contains(".jpg") || s.contains(".png")) || s.contains(".gif")) {
    				result += getPathLength(t);
    			}    			
    		
    		}
    		
    	}
		return result;
    }
    
    public int getPathLength(TreeNode t) {
    	int length = 0;
    	while(t.parent != null) {
    		length += t.name.length() + 1;
    		t = t.parent;
    	}
    	return length;
    }
    
    public int countSpaces(String s) {
    	return s.length() - s.replace(" ", "").length();
    }

    public static void main(String[] args) {
    	Task2 o = new Task2();
    	o.solution("123");
    }
}
