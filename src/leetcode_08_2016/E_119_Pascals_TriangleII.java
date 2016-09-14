package leetcode_08_2016;

import java.util.ArrayList;
import java.util.List;

public class E_119_Pascals_TriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>(); 
        List<Integer> tmp = new ArrayList<Integer>(); 
                
        for(int i=0; i<=rowIndex; i++) {
        	int prev = 0;
        	for(int j: res) {
        		tmp.add(prev + j);
        		prev = j;
        	}
        	tmp.add(1);
        	res = new ArrayList<Integer>(tmp);
        	tmp.clear();
        }

        
        return res;
    }
}
