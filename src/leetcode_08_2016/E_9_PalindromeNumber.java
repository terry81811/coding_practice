package leetcode_08_2016;

public class E_9_PalindromeNumber {
	

	public boolean isPalindrome(int x) {
		if(x<0) return false;
		
		int remainder = x;
		int reverse = 0;
		
		while(remainder > 0) {
			reverse = reverse * 10 + remainder % 10;
			remainder = remainder / 10;
		}
		if(reverse == x) return true;
		else return false;
	}
	
	// this solution fail at 10000021
    public boolean isPalindrome3(int x) {
        if(x<0) return false;
        else if(x<10) return true;
        else {
        	int lastDigit = 0;
        	int firstDigit = 0;
        	
        	while(x >= 10) {
        		if(x < 10) return true;
        		else {
        			lastDigit = x % 10;
        			int counter = 0;
        			firstDigit = x;
        			while(firstDigit >= 10) {
        				firstDigit = firstDigit / 10;
        				counter++;
        			}
        			if(firstDigit != lastDigit) return false;
        			
        			x = (int) ((x - firstDigit * Math.pow(10, counter))/ 10);
        		}
        		System.out.println(x);
        	}
        	return true;
        	
        }
    }
    
    // use String.valueOf(x)
    public boolean isPalindrome2(int x) {

        return true;
    }
    
    public static void main(String[] args) {
    	E_9_PalindromeNumber o = new E_9_PalindromeNumber();
    	o.isPalindrome(121);
    }
}
