package streams;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
	public static void main(String[] args) {
		/**List<String> names=Arrays.asList("Pranay","Ammu","Phani");
		List<String> uNames=names.stream()
				.map(name->name.toUpperCase())
				.toList();
		System.out.println(uNames);
		**/
		List<String> names=Arrays.asList("Pranay","Ammu","Phani");
		List<String> uNames=names.stream()
				.map(String::toUpperCase)
				.toList();
		System.out.println(uNames);
	}
}
