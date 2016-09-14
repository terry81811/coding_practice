package leetcode_08_2016;

public class E_26_RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        
    	if(nums.length == 0) return 0;
    	if(nums.length == 1) return 1;
    	
    	int read = 1;
    	int write = 1;
    	int curVal = nums[0];
    	for(int i=1; i<nums.length; i++) {
    		if(nums[read] == curVal) {
    			read++;
    		} else {	// read a new value
    			curVal = nums[read];
    			
    			if(write < read) {
    				nums[write] = nums[read];
    				read++;
    				write++;
    			} else if(write == read){
    				write++;
    				read++;
    			}    			
    		}
    	}
    	
    	return write;
    	
    }
    
    public static void main(String[] args) {
    	E_26_RemoveDuplicatesfromSortedArray o = new E_26_RemoveDuplicatesfromSortedArray();
    	int len = o.removeDuplicates(new int[]{1,1,2,3});
    	System.out.println();
    	System.out.println(len);
    }
}
