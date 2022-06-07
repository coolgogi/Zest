import org.junit.Test;
import org.junit.Before ;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck ;
import com.pholser.junit.quickcheck.Property ;
import com.pholser.junit.quickcheck.When ;
import org.junit.runner.RunWith ;
import static org.junit.Assert.* ;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitQuickcheck.class)
public class SimpleCalculatorPropertiesTest {

	private SimpleCalculator calculator ;

	@Before
	public void init () {
		calculator = new SimpleCalculator() ;
	}

        @Property
	public void additionTest (int a, int b) {
                assertEquals(a+b, calculator.addition(a, b)) ;
        }
       
	@Property
	public void multiplicationTest (int a, int b) {
                assertEquals(a*b, calculator.multiplication(a, b)) ;
        }
	
	@Property // default seed 0L
	public void seedTest (@When(seed = -1L) int a, int b) {
		assertEquals(a+b, calculator.addition(a, b)) ;
	}

	@Property(shrink = true) // default false
	public void ShirnkingTest (int a) {
		int b = a ;
/*
		if (a % 2 == 1) {
			b = a - 1 ;
		}
*/
		System.out.println(a) ;
		assertEquals(a, b) ;
	}


}
