package leetcode_08_2016;

public class E_70_ClimbingStairs {
    public int climbStairs(int n) {
        // f(3) = f(2) + f(1)
    	// f(2) = f(1) + f(0)
    	
    	int[] arr = new int[n+1];
    	arr[0] = 1;
    	arr[1] = 1;
    	for(int i=2; i<n+1; i++) {
    		arr[i] = arr[i-1] + arr[i-2];
    	}
    	return arr[n];
    }
}
