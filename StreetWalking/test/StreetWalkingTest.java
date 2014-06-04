import org.junit.Test;
import static org.junit.Assert.*;

public class StreetWalkingTest {
	
	@Test
	public void test0() {
		int X = 4;
		int Y = 2;
		int walkTime = 3;
		int sneakTime = 10;
		assertEquals(18L, new StreetWalking().minTime(X, Y, walkTime, sneakTime));
	}
	
	@Test
	public void test1() {
		int X = 4;
		int Y = 2;
		int walkTime = 3;
		int sneakTime = 5;
		assertEquals(16L, new StreetWalking().minTime(X, Y, walkTime, sneakTime));
	}
	
	@Test
	public void test2() {
		int X = 2;
		int Y = 0;
		int walkTime = 12;
		int sneakTime = 10;
		assertEquals(20L, new StreetWalking().minTime(X, Y, walkTime, sneakTime));
	}
	
	@Test
	public void test3() {
		int X = 25;
		int Y = 18;
		int walkTime = 7;
		int sneakTime = 11;
		assertEquals(247L, new StreetWalking().minTime(X, Y, walkTime, sneakTime));
	}
	
	@Test
	public void test4() {
		int X = 24;
		int Y = 16;
		int walkTime = 12;
		int sneakTime = 10;
		assertEquals(240L, new StreetWalking().minTime(X, Y, walkTime, sneakTime));
	}
	
	@Test
	public void test5() {
		int X = 10000000;
		int Y = 50000000;
		int walkTime = 800;
		int sneakTime = 901;
		assertEquals(41010000000L, new StreetWalking().minTime(X, Y, walkTime, sneakTime));
	}
	
	@Test
	public void test6() {
		int X = 135;
		int Y = 122;
		int walkTime = 43;
		int sneakTime = 29;
		assertEquals(3929L, new StreetWalking().minTime(X, Y, walkTime, sneakTime));
	}
}
