import com.pholser.junit.quickcheck.runner.JUnitQuickcheck ;
import com.pholser.junit.quickcheck.Property ;
import java.nio.charset.StandardCharsets ;
import org.junit.runner.RunWith ; 
import static org.junit.Assert.* ;

class SimpleCalculator {

	int addition(int a, int b) {
    		return a + b ;
    	}


	int multiplication(int a, int b) {
	    	return a * b ;
        }
}

