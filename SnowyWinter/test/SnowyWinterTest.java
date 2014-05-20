import org.junit.Test;
import static org.junit.Assert.*;

public class SnowyWinterTest {
	
	@Test
	public void test0() {
		int[] startPoints = new int[] {17,85,57};
		int[] endPoints = new int[] {33,86,84};
		assertEquals(44, new SnowyWinter().snowyHighwayLength(startPoints, endPoints));
	}
	
	@Test
	public void test1() {
		int[] startPoints = new int[] {45,100,125,10,15,35,30,9};
		int[] endPoints = new int[] {46,200,175,20,25,45,40,10};
		assertEquals(132, new SnowyWinter().snowyHighwayLength(startPoints, endPoints));
	}
	
	@Test
	public void test2() {
		int[] startPoints = new int[] {4387,711,2510,1001,4687,3400,5254,584,284,1423,3755,929,2154,5719,1326,2368,554};
		int[] endPoints = new int[] {7890,5075,2600,6867,7860,9789,6422,5002,4180,7086,8615,9832,4169,7188,9975,8690,1423};
		assertEquals(9691, new SnowyWinter().snowyHighwayLength(startPoints, endPoints));
	}
	
	@Test
	public void test3() {
		int[] startPoints = new int[] {4906,5601,5087,1020,4362,2657,6257,5509,5107,5315,277,6801,2136,2921,5233,5082,497,8250,3956,5720};
		int[] endPoints = new int[] {4930,9130,9366,2322,4687,4848,8856,6302,5496,5438,829,9053,4233,4119,9781,8034,3956,9939,4908,5928};
		assertEquals(9510, new SnowyWinter().snowyHighwayLength(startPoints, endPoints));
	}
	
	@Test
	public void test4() {
		int[] startPoints = new int[] {51,807,943,4313,8319,3644,481,220,2161,448,465,1657,6290,22,6152,647,3185,4474,2168};
		int[] endPoints = new int[] {1182,912,1832,7754,9557,7980,4144,3194,7129,5535,1172,2043,6437,7252,9508,4745,8313,8020,4017};
		assertEquals(9535, new SnowyWinter().snowyHighwayLength(startPoints, endPoints));
	}
	
	@Test
	public void test5() {
		int[] startPoints = new int[] {8786,7391,201,4414,5822,5872,157,1832,7487,7518,2267,1763,3984,3102,7627,4099,524,1543,1022,3060};
		int[] endPoints = new int[] {9905,7957,3625,6475,9314,9332,4370,8068,8295,8177,7772,2668,7191,8480,9211,4802,2625,1924,9970,4180};
		assertEquals(9813, new SnowyWinter().snowyHighwayLength(startPoints, endPoints));
	}
}
