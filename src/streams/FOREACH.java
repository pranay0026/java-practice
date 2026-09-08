package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FOREACH {
	public static void main(String[] args) {
		List<Integer> ans=Arrays.asList(4,5,6,7);
		ans.forEach(n->System.out.println(n));
		
		Consumer<Integer> con=(n) -> System.out.println(n);
		ans.forEach(con);
	}
}
