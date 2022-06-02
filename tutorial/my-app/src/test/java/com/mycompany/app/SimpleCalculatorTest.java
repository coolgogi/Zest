import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck ;
import com.pholser.junit.quickcheck.Property ;
import java.nio.charset.StandardCharsets ;
import org.junit.runner.RunWith ;
import static org.junit.Assert.* ;

public class SimpleCalculatorTest {
	@Test
	public void addition() {

		SimpleCalculatorProperties p = new SimpleCalculatorProperties() ;
		// generator
		p.additionTest(int.class, int.class) ;
		
	}

}

