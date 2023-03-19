package sdr.demo.StreamRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class lastElement {

	public static <T> T
    lastElementInStream(Stream<T> stream)
    {
        T last_element
            = stream
  
                  // reduce() method reduces the Stream
                  // to a single element, which is last.
                  .reduce((a, b) -> b)
  
                  // if stream is empty
                  // null is returned
                  .orElse(null)
                  ;
  
        return last_element;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> mainList = new ArrayList<>();
		List<Integer> sortList = new ArrayList<>();

		mainList.add(1);
		mainList.add(5);
		mainList.add(3);
		mainList.add(4);
		mainList.add(7);
		mainList.add(6);
		mainList.add(10);
		mainList.add(9);
		mainList.add(2);
		mainList.add(8);

		
	    Stream<Integer> anStream = Stream.of(1, 2, 3, 4, 5);

	    Stream<Integer> newStream = Stream.concat(Stream.of(99), anStream);
	    
	    //System.out.println(newStream.collect(Collectors.toList()));

	    System.out.println(
	            "Last Element: "
	            + lastElementInStream(newStream));
	    
		   // System.out.println(newStream.collect(Collectors.toList()));
			//Collections.sort(mainList, Collections.reverseOrder());

	    }
}
