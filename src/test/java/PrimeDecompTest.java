import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeDecompTest {

    private PrimeDecomp primeDecomp;

    @Before
    public void setUp() throws Exception {
        primeDecomp = new PrimeDecomp();
    }

    @Test
    public void should_return_1_given_1() throws Exception {
        assertThat(primeDecomp.factors(1), is(asList(1)));
    }

    @Test
    public void should_return_2_given_2() throws Exception {
        assertThat(primeDecomp.factors(2), is(asList(2)));

    }
}
