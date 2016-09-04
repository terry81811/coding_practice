package leetcode_08_2016;

public class E_371_SumofTwoIntegers {
    public int getSum(int a, int b) {
    	
    	int carry = 0;
    	while (b != 0) {
    		carry = (a & b) << 1;
    		a = a ^ b;	//add
    		b = carry;	//find carry
    	}
	
    	return a;
    }
    
    public static void main(String[] args) {
    	E_371_SumofTwoIntegers e = new E_371_SumofTwoIntegers();
    	int res = e.getSum(2, 3);
    	System.out.println(res);
    }
}
