package leetcode_08_2016;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class E_387_FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++) {
        	if(!m.containsKey(s.charAt(i))) {
        		m.put(s.charAt(i), i);
        	} else {
        		m.put(s.charAt(i), -1);
        	}
        }
        
        int minIndex = Integer.MAX_VALUE;
        for(Entry<Character, Integer> e: m.entrySet()) {
        	if(e.getValue() != -1) {
            	minIndex = Math.min(e.getValue(), minIndex);       		
        	}
        }
        if(minIndex == Integer.MAX_VALUE) return -1;
        return minIndex;
        
    }
    
    // use int arr[26], the arr denote character frequency
    public int firstUniqChar2(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
    
}
