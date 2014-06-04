import org.junit.Test;
import static org.junit.Assert.*;

public class SquareDigitNumbersTest {
	
	@Test
	public void test0() {
		int n = 0;
		assertEquals(0, new SquareDigitNumbers().getNumber(n));
	}
	
	@Test
	public void test1() {
		int n = 5;
		assertEquals(11, new SquareDigitNumbers().getNumber(n));
	}
	
	@Test
	public void test2() {
		int n = 16;
		assertEquals(100, new SquareDigitNumbers().getNumber(n));
	}
	
	@Test
	public void test3() {
		int n = 121;
		assertEquals(1941, new SquareDigitNumbers().getNumber(n));
	}
	
	@Test
	public void test4() {
		int n = 123;
		assertEquals(1949, new SquareDigitNumbers().getNumber(n));
	}
}
