import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import com.pholser.junit.quickcheck.Property;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class CalculatorWithQc {

      	public int evaluate(String expression) {
	    	int sum = 0;
	    	for (String summand: expression.split("\\+"))
		  	sum += Integer.valueOf(summand);
	    	return sum;
      	}
}
