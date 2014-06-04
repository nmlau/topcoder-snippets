import org.junit.Test;
import static org.junit.Assert.*;

public class RoughStringsTest {
	
	@Test
	public void test0() {
		String s = "aaaaabbc";
		int n = 1;
		assertEquals(3, new RoughStrings().minRoughness(s, n));
	}
	
	@Test
	public void test1() {
		String s = "aaaabbbbc";
		int n = 5;
		assertEquals(0, new RoughStrings().minRoughness(s, n));
	}
	
	@Test
	public void test2() {
		String s = "veryeviltestcase";
		int n = 1;
		assertEquals(2, new RoughStrings().minRoughness(s, n));
	}
	
	@Test
	public void test3() {
		String s = "gggggggooooooodddddddllllllluuuuuuuccckkk";
		int n = 5;
		assertEquals(3, new RoughStrings().minRoughness(s, n));
	}
	
	@Test
	public void test4() {
		String s = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
		int n = 17;
		assertEquals(0, new RoughStrings().minRoughness(s, n));
	}
	
	@Test
	public void test5() {
		String s = "bbbccca";
		int n = 2;
		assertEquals(0, new RoughStrings().minRoughness(s, n));
	}
}
