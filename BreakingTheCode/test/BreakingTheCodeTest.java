import org.junit.Test;
import static org.junit.Assert.*;

public class BreakingTheCodeTest {
	
	@Test
	public void test0() {
		String code = "abcdefghijklmnopqrstuvwxyz";
		String message = "test";
		assertEquals("20051920", new BreakingTheCode().decodingEncoding(code, message));
	}
	
	@Test
	public void test1() {
		String code = "abcdefghijklmnopqrstuvwxyz";
		String message = "20051920";
		assertEquals("test", new BreakingTheCode().decodingEncoding(code, message));
	}
	
	@Test
	public void test2() {
		String code = "qesdfvujrockgpthzymbnxawli";
		String message = "mwiizkelza";
		assertEquals("19242626171202251723", new BreakingTheCode().decodingEncoding(code, message));
	}
	
	@Test
	public void test3() {
		String code = "faxmswrpnqdbygcthuvkojizle";
		String message = "02170308060416192402";
		assertEquals("ahxpwmtvza", new BreakingTheCode().decodingEncoding(code, message));
	}
}
