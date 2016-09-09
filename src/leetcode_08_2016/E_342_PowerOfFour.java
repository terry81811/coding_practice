package leetcode_08_2016;

public class E_342_PowerOfFour {
    public boolean isPowerOfFour(int num) {
    	if(num < 1) return false;
    	while(num > 1) {
    		if(num % 4 != 0) return false;
    		num = num / 4;
    	}
    	return true;
    	
    }
    
    
//    Any number that is a power of 4 will have 1 followed by even number of 0's
	public boolean isPowerOfFour2(int num) {
		return Integer.toBinaryString(num).matches("1(00)*");
	}
}
