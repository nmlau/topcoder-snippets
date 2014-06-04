import org.junit.Test;
import static org.junit.Assert.*;

public class MountainWalkTest {
	
	@Test
	public void test0() {
		String[] areaMap = new String[] {"056",
 "135",
 "234"};
		int heightDifference = 1;
		assertEquals(5, new MountainWalk().cellsVisited(areaMap, heightDifference));
	}
	
	@Test
	public void test1() {
		String[] areaMap = new String[] {"056",
 "195",
 "234"};
		int heightDifference = 1;
		assertEquals(8, new MountainWalk().cellsVisited(areaMap, heightDifference));
	}
	
	@Test
	public void test2() {
		String[] areaMap = new String[] {"865",
 "123",
 "111"};
		int heightDifference = 3;
		assertEquals(9, new MountainWalk().cellsVisited(areaMap, heightDifference));
	}
	
	@Test
	public void test3() {
		String[] areaMap = new String[] {"00009876543210",
 "00009876543210",
 "00009876543210",
 "00009876543210"};
		int heightDifference = 8;
		assertEquals(16, new MountainWalk().cellsVisited(areaMap, heightDifference));
	}
	
	@Test
	public void test4() {
		String[] areaMap = new String[] {"0000",
 "0000",
 "0000",
 "0000",
 "9999",
 "8888",
 "7777",
 "6666",
 "5555",
 "4444",
 "3333",
 "2222",
 "1111",
 "0000"};
		int heightDifference = 3;
		assertEquals(16, new MountainWalk().cellsVisited(areaMap, heightDifference));
	}
	
	@Test
	public void test5() {
		String[] areaMap = new String[] {"173642855131893831828253420",
 "126290035950506994475683704",
 "381277675415026563959463393",
 "019782700912864681764582260",
 "496448425114634806770407597",
 "049628433145840178727435051",
 "117194708226266248973780562",
 "398138380998246682323622510",
 "408178777661559971959512111"};
		int heightDifference = 8;
		assertEquals(135, new MountainWalk().cellsVisited(areaMap, heightDifference));
	}
	
	@Test
	public void test6() {
		String[] areaMap = new String[] {"9"};
		int heightDifference = 0;
		assertEquals(1, new MountainWalk().cellsVisited(areaMap, heightDifference));
	}
}
