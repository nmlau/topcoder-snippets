import org.junit.Test;
import static org.junit.Assert.*;

public class TwoStringMasksTest {
	
	@Test
	public void test0() {
		String s1 = "TOPC*DER";
		String s2 = "T*PCODER";
		assertEquals("TOPCODER", new TwoStringMasks().shortestCommon(s1, s2));
	}
	
	@Test
	public void test1() {
		String s1 = "HELLO*";
		String s2 = "HI*";
		assertEquals("impossible", new TwoStringMasks().shortestCommon(s1, s2));
	}
	
	@Test
	public void test2() {
		String s1 = "GOOD*LUCK";
		String s2 = "*";
		assertEquals("GOODLUCK", new TwoStringMasks().shortestCommon(s1, s2));
	}
	
	@Test
	public void test3() {
		String s1 = "*SAMPLETEST";
		String s2 = "THIRDSAMPLE*";
		assertEquals("THIRDSAMPLETEST", new TwoStringMasks().shortestCommon(s1, s2));
	}
	
	@Test
	public void test4() {
		String s1 = "*TOP";
		String s2 = "*CODER";
		assertEquals("impossible", new TwoStringMasks().shortestCommon(s1, s2));
	}
	
	@Test
	public void test5() {
		String s1 = "*";
		String s2 = "A*";
		assertEquals("A", new TwoStringMasks().shortestCommon(s1, s2));
	}
	
	@Test
	public void test6() {
		String s1 = "*A";
		String s2 = "B*";
		assertEquals("BA", new TwoStringMasks().shortestCommon(s1, s2));
	}
	
	@Test
	public void test7() {
		String s1 = "LASTCASE*";
		String s2 = "*LASTCASE";
		assertEquals("LASTCASE", new TwoStringMasks().shortestCommon(s1, s2));
	}
}
