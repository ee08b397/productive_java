import java.util.*;

public class FindBug {
	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<Integer>();
		doSomething(ages);
		// int age = ages.get(0);
		
		int age = ages.get(0).intValue();
		
		// runtime error
		// ages.get(0);
	}
	public static Integer doSomething(List<Integer> args) {
		return null;
	}
}
