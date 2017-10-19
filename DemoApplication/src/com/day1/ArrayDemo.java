package com.day1;

public class ArrayDemo {
	public static void main(String[] args) {
		int[][] array = {
				{1,3,2},
				{1,3,2,5},
				{1,3,2,5,0,4},
				};
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("array["+i+"]["+j+"] "+array[i][j]);
			}
		}
		
		
	}

}
