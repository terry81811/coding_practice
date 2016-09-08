package leetcode_08_2016;

import java.util.HashSet;
import java.util.Set;

public class E_202_HappyNumber {
    public boolean isHappy(int n) {
    	if(n == 1) return true;
        String s = Integer.toString(n);
        
        Set<String> prevInt = new HashSet<String>();
        
        while(!s.equals("1")) {
        	int res = 0;
            for(int i=0; i<s.length(); i++) {
            	res += Math.pow(Integer.valueOf(String.valueOf(s.charAt(i))), 2);
            }
            s = res + "";
            if(prevInt.contains(s)) return false;
            prevInt.add(s);
        }
        System.out.println("true");
        return true;
    }
    
    public static void main(String[] args) {
    	E_202_HappyNumber o = new E_202_HappyNumber();
    	o.isHappy(7);
    }
}
