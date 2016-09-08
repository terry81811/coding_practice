package interview;

public class Task1 {
	public int solution(int X) {
		// write your code in Java SE 8
	    String s = String.valueOf(X);
	    int min = Integer.MAX_VALUE;
	        
	    for(int i=0; i < s.length() - 1; i++) {
	    	
	    	// find the larger digit within each adjacent pair
	    	int max = Math.max(Integer.valueOf(s.substring(i, i+1)), Integer.valueOf(s.substring(i+1, i+2)));
	    	
	    	// construct a new string using substring method
	    	String newStr = s.substring(0, i) + max + s.substring(i+2, s.length());	  
	    	
	    	// build integer from string and find the min int
	    	int newInt = Integer.valueOf(newStr);
	    	min = Math.min(newInt, min);
	    }
	    return min; 
	}
	
	public static void main(String[] args) {
		Task1 o = new Task1();
		o.solution(233614);
	}
}
