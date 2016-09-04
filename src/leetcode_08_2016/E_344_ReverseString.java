package leetcode_08_2016;

public class E_344_ReverseString {
    public String reverseString(String s) {
    	if(s == null) {
    		return null;    		
    	}
    	char[] res = new char[s.length()];
    	for(int i=0; i<s.length(); i++) {
    		res[i] = s.charAt(s.length()-i-1);
    	}
    	return new String(res);
    }
}
