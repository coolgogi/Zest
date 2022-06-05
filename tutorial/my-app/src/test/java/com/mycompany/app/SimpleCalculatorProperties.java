import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck ;
import com.pholser.junit.quickcheck.Property ;
import java.nio.charset.StandardCharsets ;
import org.junit.runner.RunWith ;
import static org.junit.Assert.* ;

@RunWith(JUnitQuickcheck.class)
public class SimpleCalculatorProperties {
	
	private SimpleCalculator c ;
	@Before 

        @Property public void additionTest(int a, int b) {
                SimpleCalculator calculator = new SimpleCalculator() ;
                int c = calculator.addition(a, b) ;
                int d = a + b ;
                System.out.println(a) ;
                System.out.println(b) ;
                assertEquals(c, d) ;
        }
        
	@Property public void multiplicationTest(int a, int b) {
                SimpleCalculator calculator = new SimpleCalculator() ;
                int c = calculator.multiplication(a, b) ;
                int d = a * b ;

		System.out.println(c) ;
		System.out.println(d) ;
                assertEquals(c, d) ;
        }
}
