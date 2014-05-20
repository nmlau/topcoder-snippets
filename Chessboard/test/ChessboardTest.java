import org.junit.Test;
import static org.junit.Assert.*;

public class ChessboardTest {
	
	@Test
	public void test0() {
		String cell = "1";
		assertEquals("a1", new Chessboard().changeNotation(cell));
	}
	
	@Test
	public void test1() {
		String cell = "2";
		assertEquals("b1", new Chessboard().changeNotation(cell));
	}
	
	@Test
	public void test2() {
		String cell = "26";
		assertEquals("b4", new Chessboard().changeNotation(cell));
	}
	
	@Test
	public void test3() {
		String cell = "c1";
		assertEquals("3", new Chessboard().changeNotation(cell));
	}
	
	@Test
	public void test4() {
		String cell = "e4";
		assertEquals("29", new Chessboard().changeNotation(cell));
	}
	
	@Test
	public void test5() {
		String cell = "h8";
		assertEquals("64", new Chessboard().changeNotation(cell));
	}
}
