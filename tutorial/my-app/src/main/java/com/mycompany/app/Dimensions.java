import java.awt.Dimension ;
import com.pholser.junit.quickcheck.random.SourceOfRandomness ;
import com.pholser.junit.quickcheck.generator.GenerationStatus ;
import com.pholser.junit.quickcheck.generator.Generator ;
import com.pholser.junit.quickcheck.generator.Gen ;

import static org.junit.Assert.* ;

public class Dimensions extends Generator<Dimension> {
        public Dimensions() {
            super(Dimension.class);
        }

        @Override 
	public Dimension generate(SourceOfRandomness r, GenerationStatus status) {
                int w = r.nextInt(99) + 1 ;
                int h = r.nextInt(99) + 1 ;
                return new Dimension(w, h) ;
        }
}
