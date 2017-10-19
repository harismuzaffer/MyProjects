package com.day5;

import sun.awt.datatransfer.DataTransferer.IndexOrderComparator;

public class MultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int[] arr1= new int[4];
			int[][] arr2= new int[3][];
			int[] arr3= new int[8];
			//System.out.println(arr1[6]);
			System.out.println(arr2[1][3]);
		}
//		catch (NullPointerException e) {
//			System.out.println(e);
//		}
//		catch (IndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		catch (NegativeArraySizeException e) {
//			System.out.println(e);
//		}
		catch (IndexOutOfBoundsException | NullPointerException | NegativeArraySizeException e) {
			System.out.println(e);
		}
	}

}
