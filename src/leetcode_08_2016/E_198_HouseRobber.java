package leetcode_08_2016;

public class E_198_HouseRobber {
    public int rob(int[] nums) {
        int[] amount = new int[nums.length];
        
        int sum;
        
        amount[0] = nums[0];
        amount[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<nums.length; i++) {
        	amount[i] = Math.max(amount[i-2] + nums[i], amount[i-1]);
        }
        
        return Math.max(amount[nums.length-1], amount[nums.length-2]);
    }
}
