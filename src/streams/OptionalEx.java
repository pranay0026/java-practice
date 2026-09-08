package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx { //1.8
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Pranay","Ammu","Vinay","Smiley");
		/**Optional<String> name=names.stream()
				.filter(str->str.contains("n"))
				.findFirst();
		System.out.println(name.orElse("Not Found"));
		**/
		
		String name=names.stream()
				.filter(str->str.contains("X"))
				.findFirst()
				.orElse("Not Found");
		System.out.println(name);
	}
}
