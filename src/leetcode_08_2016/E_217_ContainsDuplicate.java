package leetcode_08_2016;

import java.util.HashSet;
import java.util.Set;

public class E_217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
    	Set<Integer> m = new HashSet<Integer>();
        
    	for(int i: nums) {
    		if(m.contains(i)) {
    			return true;
    		} else {
    			m.add(i);
    		}
    	}
    	return false;
    	
    }
}
