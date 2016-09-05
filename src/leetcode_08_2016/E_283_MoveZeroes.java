package leetcode_08_2016;

public class E_283_MoveZeroes {
    public void moveZeroes(int[] nums) {
    	
    	int wIndex = 0;
    	int rIndex = 0;
    	
    	while(rIndex < nums.length) {
    		if(nums[rIndex] != 0) {
    			nums[wIndex] = nums[rIndex];
    			wIndex++;
    		}
    		rIndex++;
    	}
    	
    	while(wIndex < nums.length) {
    		nums[wIndex] = 0;
    		wIndex++;
    	}
        
    }
}
