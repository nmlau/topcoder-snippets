import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleRotationDecoderTest {
	
	@Test
	public void test0() {
		String cipherText = "mmbtvrbhhtgohaktklqegnrmlelojotyeyeiudvtil ey ffg";
		assertEquals("the quick brown fox jumps over the lazy dog again", new SimpleRotationDecoder().decode(cipherText));
	}
	
	@Test
	public void test1() {
		String cipherText = "ntgntgntgntofwlfwlfwlnookookook";
		assertEquals("he he he heh he he heh he he he", new SimpleRotationDecoder().decode(cipherText));
	}
	
	@Test
	public void test2() {
		String cipherText = "f sgnzslhzquq ydyuinmqiwfyrtdvn";
		assertEquals("abkbprnn usmlbqz mdpelkoa jofni", new SimpleRotationDecoder().decode(cipherText));
	}
	
	@Test
	public void test3() {
		String cipherText = "shxnaaeqjlofhhsuurbhpdgt z";
		assertEquals("naeiui jrghnca pnzxaxz avs", new SimpleRotationDecoder().decode(cipherText));
	}
}
