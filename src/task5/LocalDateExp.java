package task5;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;

//Question no 4

public class LocalDateExp {
	public static String getDaymonthyear(LocalDate birthDate) {
	
	LocalDate curDate=LocalDate.now();
	Period period=Period.between(birthDate, curDate);
	return period.getYears()+" Years, "+period.getMonths()+" months, "+period.getDays()+" days";

}
	public static void main(String[] arg) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your birthdate (yyyy-mm-dd): ");
		String birthDateString=obj.nextLine();
		LocalDate birthDate=LocalDate.parse(birthDateString);
		String age=getDaymonthyear(birthDate);
		System.out.println("Your age is: "+age);
		obj.close();
	}
}
