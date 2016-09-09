package leetcode_08_2016;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E_345_ReverseVowelsofaString {
    public String reverseVowels(String s) {
    	
    	Character[] charArr = new Character[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    	
    	Set<Character> charSet = new HashSet<Character>(Arrays.asList(charArr));

    	char[] ch = s.toCharArray();
    	if(s.length() <= 1) return s;
    	
    	int lIndex = 0;
    	int hIndex = s.length() - 1;
    	while(lIndex < hIndex) {
    		if(charSet.contains(ch[lIndex]) && charSet.contains(ch[hIndex])) {
    			char tmp = ch[lIndex];
    			ch[lIndex] = ch[hIndex];
    			ch[hIndex] = tmp;
    			lIndex++;
    			hIndex--;
    		} else if(charSet.contains(s.charAt(lIndex))) {
    			hIndex--;
    		} else if(charSet.contains(s.charAt(hIndex))) {
    			lIndex++;
    		} else {
    			lIndex++;
    			hIndex--;
    		}
    	
    	}
    	
    	return new String(ch);

    }

    public static void main(String[] args) {
    	E_345_ReverseVowelsofaString o = new E_345_ReverseVowelsofaString();
    	o.reverseVowels("aA");
    }
}

