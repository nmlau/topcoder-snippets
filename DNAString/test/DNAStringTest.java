import org.junit.Test;
import static org.junit.Assert.*;

public class DNAStringTest {
	
	@Test
	public void test0() {
		int maxPeriod = 3;
		String[] dna = new String[] {"ATAGATA"};
		assertEquals(1, new DNAString().minChanges(maxPeriod, dna));
	}
	
	@Test
	public void test1() {
		int maxPeriod = 2;
		String[] dna = new String[] {"ACGTGCA"};
		assertEquals(3, new DNAString().minChanges(maxPeriod, dna));
	}
	
	@Test
	public void test2() {
		int maxPeriod = 13;
		String[] dna = new String[] {"ACGCTGACAGATA"};
		assertEquals(0, new DNAString().minChanges(maxPeriod, dna));
	}
	
	@Test
	public void test3() {
		int maxPeriod = 1;
		String[] dna = new String[] {"AAAATTTCCG"};
		assertEquals(6, new DNAString().minChanges(maxPeriod, dna));
	}
	
	@Test
	public void test4() {
		int maxPeriod = 12;
		String[] dna = new String[] {"ACGTATAGCATGACA","ACAGATATTATG","ACAGATGTAGCAGTA","ACCA","GAC"};
		assertEquals(20, new DNAString().minChanges(maxPeriod, dna));
	}
}
