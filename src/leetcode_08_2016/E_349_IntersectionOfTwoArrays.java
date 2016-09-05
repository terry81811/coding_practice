package leetcode_08_2016;

import java.util.HashSet;
import java.util.Set;

public class E_349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
    	Set<Integer> s1 = new HashSet<Integer>();
    	Set<Integer> s2 = new HashSet<Integer>();
    	
    	for(int i: nums1) {
    		s1.add(i);
    	}
    	for(int j: nums2) {
    		s2.add(j);
    	}
    	
    	s1.retainAll(s2);
    	int[] res = new int[s1.size()];
    	int i = 0;
    	for(Integer e: s1) {
    		res[i] = e;
    		i++;
    	}
    	return res;
    }
}
