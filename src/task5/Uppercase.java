package task5;

import java.util.stream.Stream;

//Question no 1

public class Uppercase {
	public static void main(String[] arg) {
		Stream<String> names = Stream.of("aBc", "d", "ef");
		
		names.map(String::toUpperCase).forEach(System.out::print);
		
	}

}
