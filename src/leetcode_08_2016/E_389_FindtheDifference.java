package leetcode_08_2016;

import java.util.HashMap;
import java.util.Map;

public class E_389_FindtheDifference {
    public char findTheDifference(String s, String t) {
    	Map<Character, Integer> m = new HashMap<Character, Integer>();
    	for(int i=0; i<t.length(); i++) {
    		if(m.containsKey(t.charAt(i))) {
    			m.put(t.charAt(i), m.get(t.charAt(i)) + 1);
    		} else {
    			m.put(t.charAt(i), 1);
    		}
    	}
    	System.out.println(m);
    	
    	for(int i=0; i<s.length(); i++) {
    		m.put(s.charAt(i), m.get(s.charAt(i)) - 1);
    		if(m.get(s.charAt(i)) == 0) {
    			m.remove(s.charAt(i));
    		}
    	}
    	System.out.println(m);
    	return (char) m.keySet().toArray()[0];
    }
    
    // using ASCII code
    public char findTheDifference2(String s, String t) {
    	char sum_s = 'a';
    	char sum_t = 'a';
    	int i = 0;
    	for (; i < s.length(); i++) {
	    	sum_s += s.charAt(i);
	    	sum_t += t.charAt(i);
    	}
    	sum_t += t.charAt(i);
    	return (char) (sum_t - sum_s);
    }
    
    public static void main(String args[]) {
    	E_389_FindtheDifference o = new E_389_FindtheDifference();
    	char c = o.findTheDifference("abcd", "abcde");
    	System.out.println(c);
    }
}
