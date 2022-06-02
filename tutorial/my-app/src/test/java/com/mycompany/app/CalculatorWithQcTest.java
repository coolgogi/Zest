import com.pholser.junit.quickcheck.random.SourceOfRandomness ;
import com.pholser.junit.quickcheck.internal.generator.SimpleGenerationStatus;
import com.pholser.junit.quickcheck.generator.Gen ;

import static org.junit.Assert.assertEquals ;
import org.junit.Before ;
import org.junit.Test ;

import java.util.Random ;

public class CalculatorWithQcTest {
  private SourceOfRandomness random ;
  private SimpleGenerationStatus status ;

  @Before public void init() {
    random = new SourceOfRandomness(new Random(0)) ;
    status = new SimpleGenerationStatus(null, null, 0) ;
  }

  @Test
  public void evaluatesExpression() {
    CalculatorWithQc calculator = new CalculatorWithQc() ;
   	
    Gen<Integer> i_generator = Gen.oneOf(1, 2, 3, 4, 5) ;
    i_generator.generate(random, status) ;

    String input = "" ;
    int ans = 0 ;
    int num = i_generator.generate(random, status) ;
    for (int i = 0 ; i < num - 1 ; i++) {
	int tp = i_generator.generate(random, status) ;
	ans = ans + tp ;
	input = input + String.valueOf(tp) ;
	input = input + "+" ;
    }
    int tp = i_generator.generate(random, status) ;
    ans = ans + tp ;
    input = input + String.valueOf(tp) ;

    int sum = calculator.evaluate(input) ;
    
    assertEquals(ans, sum) ;
  }
}
