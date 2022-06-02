import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPropertiesTest {
	@Test public void concatenationLengthTest() {
		StringProperties sp = new StringProperties() ;
		String s1 = "hello" ;
		String s2 = "world" ;
		sp.concatenationLength(s1, s2) ;
	}

}
