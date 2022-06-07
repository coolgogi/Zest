import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;
import com.pholser.junit.quickcheck.generator.NullAllowed ;

import static org.junit.Assert.*;

@RunWith(JUnitQuickcheck.class)
public class StringPropertiesTest {

	@Property(trials = 5) //default 100
       	public void ConcatenationLength (String s1, String s2) {
		assertEquals(s1.length() + s2.length(), (s1 + s2).length());
	}
	
	@Property(trials = 5)//@NullAllowed default 0.2
	public void NullTest (@NullAllowed(probability = 1.0f) String s1) {
		assertEquals(s1, null) ;
	}

}
