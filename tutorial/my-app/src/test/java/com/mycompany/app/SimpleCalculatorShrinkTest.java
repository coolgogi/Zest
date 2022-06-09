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
public class SimpleCalculatorShrinkTest {
	@Property(shrink = true) // default false
	public void ShirnkTest (int a) {
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
