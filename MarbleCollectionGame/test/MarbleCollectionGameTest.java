import org.junit.Test;
import static org.junit.Assert.*;

public class MarbleCollectionGameTest {
	
	@Test
	public void test0() {
		String[] board = new String[] {"7"};
		assertEquals(7, new MarbleCollectionGame().collectMarble(board));
	}
	
	@Test
	public void test1() {
		String[] board = new String[] {"0",
 "8"};
		assertEquals(8, new MarbleCollectionGame().collectMarble(board));
	}
	
	@Test
	public void test2() {
		String[] board = new String[] {"264",
 "3LL"};
		assertEquals(15, new MarbleCollectionGame().collectMarble(board));
	}
	
	@Test
	public void test3() {
		String[] board = new String[] {"8U4L9",
 "0183U",
 "U8#38",
 "2158#",
 "L65U7"};
		assertEquals(44, new MarbleCollectionGame().collectMarble(board));
	}
	
	@Test
	public void test4() {
		String[] board = new String[] {"039LLLU",
 "953348#",
 "0L87#29",
 "718#4#U",
 "594U196"};
		assertEquals(55, new MarbleCollectionGame().collectMarble(board));
	}
}
