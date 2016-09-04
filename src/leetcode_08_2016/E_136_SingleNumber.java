package leetcode_08_2016;

public class E_136_SingleNumber {
    public int singleNumber(int[] nums) {
    	int res = 0;
    	for(int i: nums) {
    		res = res^i;
    	}
    	return res;
    }
}
