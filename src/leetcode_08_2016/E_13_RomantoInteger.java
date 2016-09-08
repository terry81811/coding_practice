package leetcode_08_2016;

public class E_13_RomantoInteger {
    public int romanToInt(String s) {
//    	"IVXLCDM"
    	int res = 0;
    	for(int i = s.length() - 1; i>=0; i--) {
    		switch(s.charAt(i)) {
    			case 'I':
    				res += res>=5 ? -1 : 1;
    				break;
    			case 'V':
    				res += 5;
    				break;
    			case 'X':
    				res += res>=50 ? -10 : 10;
    				break;
    			case 'L':
    				res += 50;
    				break;
    			case 'C':
    				res += res>=500 ? -100 : 100;
    				break;
    			case 'D':
    				res += 500;
    				break;
    			case 'M':
    				res += 1000;
    				break;
    		}
    	}
    	return res;
    	
    }
    
    public static void main(String[] args) {
    	
    }
}
