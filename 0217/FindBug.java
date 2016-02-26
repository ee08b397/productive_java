import java.util.List;
import java.util.ArrayList;

public class FindBug {
	public static void main(String[] args) {
		List<Integer> ages = new ArrayList<Integer>();
		doSomething(ages);

		int age = ages.get(0);
		// int age = ages.get(0).intValue();
	}
	public static void doSomething(List<Integer> ages) {
		ages.add(null);
	}
}
