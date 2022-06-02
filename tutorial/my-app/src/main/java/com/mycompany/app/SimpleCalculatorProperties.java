import com.pholser.junit.quickcheck.runner.JUnitQuickcheck ;
import com.pholser.junit.quickcheck.Property ;
import java.nio.charset.StandardCharsets ;
import org.junit.runner.RunWith ; 
import static org.junit.Assert.* ;

class SimpleCalculator {

	int addition(int a, int b) {
    		return a + b ;
    	}


	int multiplication(int a, int b) {
	    	return a * b ;
        }
}

@RunWith(JUnitQuickcheck.class)
public class SimpleCalculatorProperties {
        @Property public void additionTest(int a, int b) {
                SimpleCalculator calculator = new SimpleCalculator() ;
                int c = calculator.addition(a, b) ;
                int d = a + b ;
		System.err.println(a) ;
		System.err.println(b) ;
                assertEquals(c, d) ;
        }
        @Property public void multiplicationTest(int a, int b) {
                SimpleCalculator calculator = new SimpleCalculator() ;
                int c = calculator.multiplication(a, b) ;
                int d = a * b ;
                assertEquals(c, d) ;
        }
}

