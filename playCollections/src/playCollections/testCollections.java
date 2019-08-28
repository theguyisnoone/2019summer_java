package playCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testCollections {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		for(int i=0;i<10;i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
//		reverse
//		Collections.reverse(numbers);
//		System.out.println(numbers);
//		shuffle
		Collections.shuffle(numbers);
		System.out.println(numbers);
//		sort
		Collections.sort(numbers);
		System.out.println(numbers);
//		swap
		Collections.swap(numbers, 0, 9);
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
//		rotate
		Collections.rotate(numbers, 3);
		System.out.println(numbers);
	}
}
