package leetcode_08_2016;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class E_350_IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> m2 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> m3 = new HashMap<Integer, Integer>();
        
        for(int i: nums1) {
        	if(m1.containsKey(i)) {
        		m1.put(i, m1.get(i) + 1);
        	} else {
        		m1.put(i, 1);
        	}
        }

        for(int i: nums2) {
        	if(m2.containsKey(i)) {
        		m2.put(i, m2.get(i) + 1);
        	} else {
        		m2.put(i, 1);
        	}
        }
        
        System.out.println(m1);
        System.out.println(m2);
        
        for(Entry<Integer, Integer> e: m1.entrySet()) {
        	if(m2.containsKey(e.getKey())) {
        		m3.put(e.getKey(), Math.min(e.getValue(), m2.get(e.getKey())));
        	}
        }
        System.out.println(m3);
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(Entry<Integer, Integer> e: m3.entrySet()) {
        	for(int i=0; i<e.getValue(); i++) {
            	arr.add(e.getKey());        		
        	}
        }
        
        int[] resArr = new int[arr.size()];
        int i = 0;
        for(int ele: arr) {
        	resArr[i] = ele;
        	i++;
        }
        return resArr;
    }
    
    public static void main(String[] args) {
    	E_350_IntersectionofTwoArraysII o = new E_350_IntersectionofTwoArraysII();
    	int[] nums1 = new int[] {1,2};    	
    	int[] nums2 = new int[] {2,1};
    	o.intersect(nums1, nums2);
    }
}
