/**
 * If the value p being boxed is true, false, a byte, or a char in the range \u0000 to \u007f, 
 * or an int or short number between -128 and 127 (inclusive), then let r1 and r2 be the 
 * results of any two boxing conversions of p. It is always the case that r1 == r2.
 *
 * http://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html#jls-5.1.7
 * http://stackoverflow.com/questions/20897020/why-integer-class-caching-values-in-the-range-128-to-127
 */
public class IntegerCaching {
	public static void main(String[] args) {
		String as = "abc";
		String bs = "abc";
		System.out.println(as == bs);

		Integer ai = 100;
		Integer bi = 100;
		System.out.println(ai == bi);
		Integer ci = 1000;
		Integer di = 1000;
		System.out.println(ci == di);
	}
}
