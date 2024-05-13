package task5;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Question no 3

public class streamApi {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("Rahul");
		names.add("Arun");
		names.add("kavin");
		names.add("Alex");
		names.add("Frank");
		
		//for(String name:names) {
			//System.out.println(name);
		//}
		List<String> gift=names.stream().filter(fnames->fnames.startsWith("A")).collect(Collectors.toList());

		
		for(String student:gift) {
			System.out.println(student);
		}

	}

}
