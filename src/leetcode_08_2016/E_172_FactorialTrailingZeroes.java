package leetcode_08_2016;

public class E_172_FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
    	
    	int res = 0;
    	while(n > 4) {
    		res += n/5;
    		n = n/5;
    	}
    	
    	return res;
    }
    
    public static void main(String[] args) {
    	E_172_FactorialTrailingZeroes o = new E_172_FactorialTrailingZeroes();
    	o.trailingZeroes(50);
    }
}
