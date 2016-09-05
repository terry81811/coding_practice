package leetcode_08_2016;

import java.util.Arrays;

public class E_169_MajorityElement {
    public int majorityElement(int[] nums) {
    	Arrays.sort(nums);
    	return nums[nums.length/2];
    }
}
