package leetcode_08_2016;

public class E_231_PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
    	if(n == 1) return true;
    	
    	while(n>1) {
    		if(n%2 != 0) return false;
    		else {
    			n = n/2;
    		}
    	}
    	return true;
    }
    
    public boolean isPowerOfTwo2(int n) {
    	// e.g. 16 = 10000 and 15 = 01111
        return n>0 && ((n & (n-1)) == 0);
    }
}
