import java.awt.Dimension ;
import com.pholser.junit.quickcheck.random.SourceOfRandomness ;
import com.pholser.junit.quickcheck.generator.GenerationStatus ;

import com.pholser.junit.quickcheck.Property ;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck ;
import org.junit.runner.RunWith ;

import static org.junit.Assert.* ;
import org.junit.Before ;

@RunWith(JUnitQuickcheck.class)
public class DimensionProperties {
	private Dimensions g ;
//	private 

	@Before
	public void setUp() {
		g = new Dimensions() ;	
	}

	@Property
	public void DimensionProperties() {
//		g.generator
	}

}
