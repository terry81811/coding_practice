package leetcode_08_2016;


public class E_66_PlusOne {
    public int[] plusOne(int[] digits) {
    	int carry = 1;
        int read = digits.length - 1;
        
        while(read >= 0 && carry == 1) {
        	int tmp = (digits[read] + carry) > 9 ? 1 : 0;
        	digits[read] = (digits[read] + carry) % 10;
        	carry = tmp;
        	read--;
        }
                
        if(carry == 1) {
        	int[] res = new int[digits.length + 1];
        	res[0] = 1;
        	for(int i=1; i<res.length; i++) {
        		res[i] = digits[i-1];
        	}
        	return res;
        } else {
            return digits;
        }        
    }
}
