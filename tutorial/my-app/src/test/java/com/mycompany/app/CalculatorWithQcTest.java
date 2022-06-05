import com.pholser.junit.quickcheck.runner.JUnitQuickcheck ;
import com.pholser.junit.quickcheck.Property ;
import com.pholser.junit.quickcheck.generator.InRange ;
import com.pholser.junit.quickcheck.random.SourceOfRandomness ;
import com.pholser.junit.quickcheck.internal.generator.SimpleGenerationStatus;
import com.pholser.junit.quickcheck.generator.Gen ;
import org.junit.runner.RunWith ;

import static org.junit.Assert.assertEquals ;
import org.junit.Before ;
import org.junit.Test ;

import java.util.Random ;

@RunWith(JUnitQuickcheck.class)
public class CalculatorWithQcTest {
 
       	private SourceOfRandomness random ;
      	private SimpleGenerationStatus status ;

      	@Before public void init() {
    		random = new SourceOfRandomness(new Random(0)) ;
     		status = new SimpleGenerationStatus(null, null, 0) ;
      	}

      	@Property(trials = 5) 
      	public void evaluatesExpression(@InRange(min = "1", max = "9") int num) {
	    	CalculatorWithQc calculator = new CalculatorWithQc() ;
	    	Gen<Integer> i_generator = Gen.oneOf(1, 2, 3, 4, 5) ;
	    	String input = "" ;
	    	int ans = 0 ;
		//    int num = i_generator.generate(random, status) ;
	    	for (int i = 0 ; i < num - 1 ; i++) {
			int tp = i_generator.generate(random, status) ;
			ans = ans + tp ;
			input = input + String.valueOf(tp) ;
			input = input + "+" ;
	    	}

	    	int tp = i_generator.generate(random, status) ;
	    	ans = ans + tp ;
	    	input = input + String.valueOf(tp) ;
	    	System.out.println(input) ;
	    	int sum = calculator.evaluate(input) ;
	    	assertEquals(ans, sum) ;
      	}
}
