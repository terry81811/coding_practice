package leetcode_08_2016;

public class E_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
    	if(nums.length == 0) return 0;
    	
    	int read = 0;
    	int write = 0;
    	
    	
    	while(read<nums.length) {
    		if(nums[read] != val) {
    			
    			if(write < read) {
    				int tmp = nums[read];
    				nums[read] = nums[write];
    				nums[write] = tmp; 
    				write++;
    			} else {
        			read++;
        			write++;
    			}
    			
    		}
    		else {
    			read++;
    		}
    	}
    	
    	return write;
    }
    
    public static void main(String[] args) {
    	E_27_RemoveElement o = new E_27_RemoveElement();
    	o.removeElement(new int[]{3}, 2);
    }
}
