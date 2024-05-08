package task5;
import java.util.*;

//Question no 2

public class isempty {
	public static void main(String[] arg) {
		List<String> strings = Arrays.asList("abc", "bc", "efg", "abcd","", "jkl");
		if(strings.isEmpty()) {
			System.out.println("The List is empty!!!");
		}else {
			for(int i=0;i<strings.size();i++) {
				System.out.println(strings.get(i));
			}
			
		}
	}

}
