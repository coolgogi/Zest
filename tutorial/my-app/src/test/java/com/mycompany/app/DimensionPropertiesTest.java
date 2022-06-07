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
public class DimensionPropertiesTest {
	private Dimensions g ;
	private SourceOfRandomness random ;
	private GenerationStatus status ;

	@Before
	public void setUp () {
		random = new SourceOfRandomness(new Random(0)) ;
		status = new SimpleGenerationStatus(null, null, 0) ;	
		g = new Dimensions() ;	
	}

	@Property(trials = 5) 
	public void DimensionProperties (@From(Dimensions.class) Dimension d) {
		System.out.println(d.getWidth()) ;
		System.out.println(d.getHeight()) ;
		Dimension newDimension = d.getSize() ;
		assertEquals(d, newDimension) ;
	}

}
