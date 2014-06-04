import org.junit.Test;
import static org.junit.Assert.*;

public class TriviaGameTest {
	
	@Test
	public void test0() {
		int[] points = new int[] {1, 2, 3, 4, 5, 6};
		int tokensNeeded = 3;
		int[] bonuses = new int[] {4, 4, 4, 4, 4, 4};
		assertEquals(29, new TriviaGame().maximumScore(points, tokensNeeded, bonuses));
	}
	
	@Test
	public void test1() {
		int[] points = new int[] {1, 2, 3, 4, 5, 6};
		int tokensNeeded = 3;
		int[] bonuses = new int[] {1, 1, 1, 20, 1, 1};
		assertEquals(39, new TriviaGame().maximumScore(points, tokensNeeded, bonuses));
	}
	
	@Test
	public void test2() {
		int[] points = new int[] {150, 20, 30, 40, 50};
		int tokensNeeded = 3;
		int[] bonuses = new int[] {0, 0, 0, 250, 0};
		assertEquals(500, new TriviaGame().maximumScore(points, tokensNeeded, bonuses));
	}
	
	@Test
	public void test3() {
		int[] points = new int[] {500, 500, 500, 0, 500};
		int tokensNeeded = 3;
		int[] bonuses = new int[] {0, 0, 0, 500, 0};
		assertEquals(2000, new TriviaGame().maximumScore(points, tokensNeeded, bonuses));
	}
}
