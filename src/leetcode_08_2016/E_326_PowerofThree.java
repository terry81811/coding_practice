package leetcode_08_2016;

public class E_326_PowerofThree {
    public boolean isPowerOfThree(int n) {
    	return ( n>0 &&  1162261467%n==0);        
    }

    public boolean isPowerOfThree2(int n) {
    	if(n <= 0) return false;
    	if(n == 1) return true;
    	
    	while(n>1) {
    		if(n%3 != 0) return false;
    		else {
        		n = n/3;    			
    		}
    	}
    	return true;
    }

}
