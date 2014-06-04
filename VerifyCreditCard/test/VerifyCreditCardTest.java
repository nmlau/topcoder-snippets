import org.junit.Test;
import static org.junit.Assert.*;

public class VerifyCreditCardTest {
	
	@Test
	public void test0() {
		String cardNumber = "21378";
		assertEquals("VALID", new VerifyCreditCard().checkDigits(cardNumber));
	}
	
	@Test
	public void test1() {
		String cardNumber = "31378";
		assertEquals("INVALID", new VerifyCreditCard().checkDigits(cardNumber));
	}
	
	@Test
	public void test2() {
		String cardNumber = "11111101";
		assertEquals("VALID", new VerifyCreditCard().checkDigits(cardNumber));
	}
	
	@Test
	public void test3() {
		String cardNumber = "50005";
		assertEquals("VALID", new VerifyCreditCard().checkDigits(cardNumber));
	}
	
	@Test
	public void test4() {
		String cardNumber = "542987223412";
		assertEquals("INVALID", new VerifyCreditCard().checkDigits(cardNumber));
	}
}
