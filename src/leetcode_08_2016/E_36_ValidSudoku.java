package leetcode_08_2016;

import java.util.ArrayList;
import java.util.List;

public class E_36_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
    	
    	
    	//row
    	for(int i=0; i<9; i++) {
        	List<Integer> list = new ArrayList<Integer>();
    		
    		for(int j=0; j<9; j++) {
    			if(board[i][j] != '.') list.add(Character.getNumericValue(board[i][j]));
    		}
    		if(containValid9(list) == false) return false;
    	}
    	
    	
    	//column
    	for(int i=0; i<9; i++) {
        	List<Integer> list = new ArrayList<Integer>();
    		
    		for(int j=0; j<9; j++) {
    			if(board[j][i] != '.') list.add(Character.getNumericValue(board[j][i]));
    		}
    		if(containValid9(list) == false) return false;
    	}    	
    	
    	//box
    	for(int i=0; i<3; i++) {
    		for(int j=0; j<3; j++) {
    			
        		List<Integer> list = new ArrayList<Integer>();
    			for(int k=0; k<3; k++) {
    				for(int l=0; l<3; l++) {
    	    			if(board[j*3+k][i*3+l] != '.') list.add(Character.getNumericValue(board[j*3+k][i*3+l]));
    				}
    			}
        		if(containValid9(list) == false) return false;
    			
    		}	
    	}    
    	
    	return true;
    }
    
    public boolean containValid9(List<Integer> list) {
    	System.out.println(list);
    	int[] arr = new int[9];
    	for(int i: list) {
    		arr[i-1]++;
    		if(arr[i-1] > 1) {
    			return false;
    		}
    	}
    	return true;
    }

}
