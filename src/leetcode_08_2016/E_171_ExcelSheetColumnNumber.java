package leetcode_08_2016;

public class E_171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
    	int res = 0;
    	
    	for(int i=0; i<s.length(); i++) {
    		if(i == s.length() - 1) {
    			res += ((s.charAt(i) - 'A' + 1)); 			
    		} else {
        		res += ((s.charAt(i) - 'A' + 1) * Math.pow(26, (s.length() - i - 1)));    			
    		}
    		
    		System.out.println(res);
    	}
        
    	return res;
    }
    
    public static void main(String[] args) {
    	E_171_ExcelSheetColumnNumber o = new E_171_ExcelSheetColumnNumber();
    	o.titleToNumber("BA");
    	
    }
}
