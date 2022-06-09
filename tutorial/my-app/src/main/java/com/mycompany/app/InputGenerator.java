import java.lang.String ;
import com.pholser.junit.quickcheck.random.SourceOfRandomness ;
import com.pholser.junit.quickcheck.generator.GenerationStatus ;
import com.pholser.junit.quickcheck.generator.Generator ;
import static org.junit.Assert.* ;
public class InputGenerator extends Generator<String> {
        public InputGenerator() {
            super(String.class);
        }

        @Override 
	public String generate(SourceOfRandomness r, GenerationStatus status) {
		String input = "[" + r.nextInt(32) ;
		int len = r.nextInt(32) ;
		for (int i = 0 ; i < len ; i++) {
			input = input + "," + r.nextInt(32) ;
		}
		input = input + "]" ;
		return input ;
        }
	
	public void compare (int[] arr, int a, int b) {
		if (arr[a] > arr[b]) {
			swap(arr, a, b) ;
			return ;
		}
		else {
			return ;
		}

	}

	public void swap (int[] arr, int a, int b) {
		int tp = arr[a] ;
		arr[a] = arr[b] ;
		arr[b] = tp ;
		return ;
	}

}
