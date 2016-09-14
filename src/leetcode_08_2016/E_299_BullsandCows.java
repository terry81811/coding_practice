package leetcode_08_2016;

public class E_299_BullsandCows {
    public String getHint(String secret, String guess) {
        
    	int A = 0;
    	int B = 0;
    	String res = "";
    	int[] arr1 = new int[10];
    	int[] arr2 = new int[10];
    	
    	
    	for(int i=0; i<secret.length(); i++) {
    		if(secret.charAt(i) == guess.charAt(i)) A++;
    		arr1[Character.getNumericValue(secret.charAt(i))]++;
    		arr2[Character.getNumericValue(guess.charAt(i))]++;
    	}
    	
    	for(int i=0; i<10; i++) {
    		B += Math.min(arr1[i], arr2[i]);
    	}
    	
    	res = res + A + "A";
    	res = res + (B-A) + "B";
    	return res;
    	
    }
}
