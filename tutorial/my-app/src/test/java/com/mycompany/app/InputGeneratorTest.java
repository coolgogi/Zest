import java.awt.Dimension ;
import com.pholser.junit.quickcheck.random.SourceOfRandomness ;
import com.pholser.junit.quickcheck.generator.GenerationStatus ;
import com.pholser.junit.quickcheck.internal.generator.SimpleGenerationStatus ;

import com.pholser.junit.quickcheck.Property ;
import com.pholser.junit.quickcheck.From ;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck ;
import org.junit.runner.RunWith ;
import java.util.Random ;
import static org.junit.Assert.* ;
import org.junit.Before ;


@RunWith(JUnitQuickcheck.class)
public class InputGeneratorTest {
	private InputGenerator g ;
	private SourceOfRandomness random ;
	private GenerationStatus status ;

	@Before
	public void setUp () {
		random = new SourceOfRandomness(new Random(0)) ;
		status = new SimpleGenerationStatus(null, null, 0) ;	
		g = new InputGenerator() ;	
	}

	@Property(trials = 5) 
	public void DimensionProperties (@From(InputGenerator.class) String str) {
		System.out.println(str) ;
		assertEquals(str.length(), str.length()) ;
	}

}
