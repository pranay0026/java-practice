package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sorted {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(4,5,6,7);
		Stream<Integer> sv=nums.stream()
				.filter(n->n%2==0)
				.sorted();
		sv.forEach(n->System.out.println(n));
	}
}
