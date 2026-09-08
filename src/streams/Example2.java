package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example2 {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(4,5,6,7);
		Predicate<Integer> p=n->n%2==0;
		Function<Integer,Integer> fun=n->n*2;
		
		int result=nums.stream()
				.filter(p)
				.map(fun)
				.reduce(0, (a,b)->a+b);
		System.out.println(result);
	}
}
