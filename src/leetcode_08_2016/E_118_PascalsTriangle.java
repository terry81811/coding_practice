package leetcode_08_2016;

import java.util.ArrayList;
import java.util.List;

public class E_118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(numRows == 0) return res;
        
        for(int i=0; i<numRows; i++) {
        	res.add(new ArrayList<Integer>());
        }
        
        res.get(0).add(1);
        
        if(numRows == 1) return res;
        
        for(int i=1; i<numRows; i++) {
        	for(int j=0; j<res.get(i - 1).size(); j++) {
        		
        		if(j == 0) {
            		res.get(i).add(1);      			
        		} else {
            		res.get(i).add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));      			        			
        		}
        	}
    		res.get(i).add(1);
        	System.out.println(res.get(i));
        }
        
        
        return res;
    }
    
    public static void main(String[] args) {
    	E_118_PascalsTriangle o = new E_118_PascalsTriangle();
    	o.generate(4);
    }
}
