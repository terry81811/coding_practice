package leetcode_08_2016;

import java.util.HashMap;
import java.util.Map;

public class E_383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
    	
    	Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(int i=0; i<ransomNote.length(); i++) {
        	if(m.containsKey(ransomNote.charAt(i))) {
        		m.put(ransomNote.charAt(i), m.get(ransomNote.charAt(i)) + 1);
        	} else {
        		m.put(ransomNote.charAt(i), 1);
        	}
        }
        
        for(int i=0; i<magazine.length(); i++) {
        	if(m.containsKey(magazine.charAt(i))) {
        		m.put(magazine.charAt(i), m.get(magazine.charAt(i)) - 1);
        		if(m.get(magazine.charAt(i)) == 0) {
        			m.remove(magazine.charAt(i));
        		}
        	}
        }
        
        if(m.size() > 0) return false;
        return true;
    }
}
