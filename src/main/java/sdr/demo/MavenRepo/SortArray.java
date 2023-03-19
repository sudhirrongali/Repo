package sdr.demo.MavenRepo;

import java.util.Arrays;

public class SortArray {

	
	public static void main(String[] args) {
		
		
		int[] sdrArray = new int[]{1,5,2,7,4};
		for (int i=0; i<sdrArray.length; i++) {
			for(int j=i+1; j< sdrArray.length;j++) {
				if(sdrArray[i]> sdrArray[j]) {
					int temp=0;
					temp = sdrArray[i];
					sdrArray[i] = sdrArray[j];
					sdrArray[j] = temp;
				}

			}
			//System.out.println("sort array : "+sdrArray[i]);
			

		}
		for (int element : sdrArray){
		    System.out.println(element);
		}
	}
}
