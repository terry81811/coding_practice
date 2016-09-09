package leetcode_08_2016;

public class E_191_Numberof1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bitCount = 0;
        while(n != 0) {
        	if((n & 1) == 1) bitCount++;
        	n = n >>> 1;
        }
        return bitCount;
    }
}
