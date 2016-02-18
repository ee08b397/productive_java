/**
 * Autoboxing time
 * 'Java Platform Performance: Strategies and Tactics'
 */

public class LongTest {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		long_exe();
		long longTime = System.currentTimeMillis(); 
		System.out.println("long: " + (longTime - startTime) + "ms");
		
		Long_exe();
		long LongTime = System.currentTimeMillis(); 
		System.out.println("Long: " + (LongTime - longTime) + "ms");
	}
	
	public static void long_exe() {
		long sum = 0L;
		for (long i = 0L; i < Integer.MAX_VALUE; ++i) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
	
	public static void Long_exe() {
		Long sumo = 0L;
		for (long i = 0L; i < Integer.MAX_VALUE; ++i) {
			sumo += i;
		}
		System.out.println("sum = " + sumo);
	}
}

/* Result:
	$ javac LongTest.java && java LongTest
	sum = 2305843005992468481
	long: 1312ms
	sum = 2305843005992468481
	Long: 7200ms
*/
