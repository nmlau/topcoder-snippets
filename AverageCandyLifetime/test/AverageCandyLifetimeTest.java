import org.junit.Test;
import static org.junit.Assert.*;

public class AverageCandyLifetimeTest {
	
	@Test
	public void test0() {
		int[] eatenCandies = new int[] {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		assertEquals(60.5, new AverageCandyLifetime().getAverage(eatenCandies), 1e-9);
	}
	
	@Test
	public void test1() {
		int[] eatenCandies = new int[] {0, 1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		assertEquals(59.0, new AverageCandyLifetime().getAverage(eatenCandies), 1e-9);
	}
	
	@Test
	public void test2() {
		int[] eatenCandies = new int[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 50, 0, 0};
		assertEquals(301.5882352941176, new AverageCandyLifetime().getAverage(eatenCandies), 1e-9);
	}
	
	@Test
	public void test3() {
		int[] eatenCandies = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		assertEquals(252.80769230769232, new AverageCandyLifetime().getAverage(eatenCandies), 1e-9);
	}
}
