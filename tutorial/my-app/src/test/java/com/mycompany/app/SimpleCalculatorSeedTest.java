import org.junit.Test;
import org.junit.Before ;
import static com.pholser.junit.quickcheck.Mode.EXHAUSTIVE ;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck ;
import com.pholser.junit.quickcheck.Property ;
import com.pholser.junit.quickcheck.When ;
import org.junit.runner.RunWith ;
import static org.junit.Assert.* ;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitQuickcheck.class)
public class SimpleCalculatorSeedTest {

	private SimpleCalculator calculator ;

	@Before
	public void init () {
		calculator = new SimpleCalculator() ;
	}

	@Property // default seed 0L
	public void SeedTest (@When(seed = -1L) int a, int b) {
		String str = "" + a + "," + b ;
		System.out.println(str) ;
		assertEquals(a+b, calculator.addition(a, b)) ;
	}
}
