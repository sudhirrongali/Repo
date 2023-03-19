package sdr.demo.MavenRepo;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> mainList = new ArrayList<>();
		List<String> sortList = new ArrayList<>();

		mainList.add("10");
		mainList.add("5");
		mainList.add("3");
		mainList.add("7");
		mainList.add("4");


		

	        

		int count=0;
		System.out.println("sorted :"+mainList);
		for (int i = 0; i < mainList.size(); i++) {
			for (int j = i + 1; j < mainList.size(); j++) { // for(int j=mainList.size()-1;j>i; j--) {

				if (mainList.get(i).compareTo(mainList.get(j))!=0) {
					System.out.println("value " + mainList.get(i));
					sortList.add(i, mainList.get(i));
					if(count==mainList.get(i).length()) {
						sortList.add(i, mainList.get(j));
					}
					String temp=mainList.get(i);
					mainList.set(i, mainList.get(j));
					mainList.set(j, temp);
					System.out.println("inner loop : "+ mainList);
				}
				
			}
			System.out.println("outer loop sorted :"+mainList);
			count++;
		}
		
		
		
//		for(int i : mainList) {
//			for(Integer j: mainList) {
//				if(i<j) {
//					sortList.add(i);
//					System.out.println("count "+count);
//					if(count==mainList.size()-1) {
//						sortList.add(j);
//						System.out.println("outer loop sorted :"+sortList);
//
//					}
//					break;
//				}
//			}
//			count++;
//
//		}


	}
}


