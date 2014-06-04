import org.junit.Test;
import static org.junit.Assert.*;

public class MinDifferenceTest {
	
	@Test
	public void test0() {
		int A0 = 3;
		int X = 7;
		int Y = 1;
		int M = 101;
		int n = 5;
		assertEquals(6, new MinDifference().closestElements(A0, X, Y, M, n));
	}
	
	@Test
	public void test1() {
		int A0 = 3;
		int X = 9;
		int Y = 8;
		int M = 32;
		int n = 8;
		assertEquals(0, new MinDifference().closestElements(A0, X, Y, M, n));
	}
	
	@Test
	public void test2() {
		int A0 = 67;
		int X = 13;
		int Y = 17;
		int M = 4003;
		int n = 23;
		assertEquals(14, new MinDifference().closestElements(A0, X, Y, M, n));
	}
	
	@Test
	public void test3() {
		int A0 = 1;
		int X = 1221;
		int Y = 3553;
		int M = 9889;
		int n = 11;
		assertEquals(275, new MinDifference().closestElements(A0, X, Y, M, n));
	}
	
	@Test
	public void test4() {
		int A0 = 1;
		int X = 1;
		int Y = 1;
		int M = 2;
		int n = 10000;
		assertEquals(0, new MinDifference().closestElements(A0, X, Y, M, n));
	}
	
	@Test
	public void test5() {
		int A0 = 1567;
		int X = 5003;
		int Y = 9661;
		int M = 8929;
		int n = 43;
		assertEquals(14, new MinDifference().closestElements(A0, X, Y, M, n));
	}
}
