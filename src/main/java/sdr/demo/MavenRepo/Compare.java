package sdr.demo.MavenRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {

	
	public static void main(String[] args ) {
		
		List<Laptop> laps = new ArrayList<>();
		
		laps.add(new Laptop("Dell", 4, 1001));
		laps.add(new Laptop("Lenovo", 8, 1025));
		laps.add(new Laptop("acer", 6, 750));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			public int compare(Laptop l1, Laptop l2) {
				if(l1.getBrand().equalsIgnoreCase(l2.getBrand())) {
					return 1;
				}
					else {
						return -1;
					}
				
			}
		};
		
		Collections.sort(laps, com);;
		
		for(Laptop l : laps) {
			System.out.println(l);
		}
	}
}
