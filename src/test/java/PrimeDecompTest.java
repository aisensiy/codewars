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
        assertThat(primeDecomp.factorList(1), is(asList(1)));
    }

    @Test
    public void should_return_2_given_2() throws Exception {
        assertThat(primeDecomp.factorList(2), is(asList(2)));
    }

    @Test
    public void should_return_3_given_3() throws Exception {
        assertThat(primeDecomp.factorList(3), is(asList(3)));
    }

    @Test
    public void should_return_2_2_given_4() throws Exception {
        assertThat(primeDecomp.factorList(4), is(asList(2, 2)));
    }

    @Test
    public void should_return_2_3_given_6() throws Exception {
        assertThat(primeDecomp.factorList(6), is(asList(2, 3)));
    }

    @Test
    public void should_return_2_2_2_give_8() throws Exception {
        assertThat(primeDecomp.factorList(8), is(asList(2, 2, 2)));
    }

    @Test
    public void should_return_3_3_given_9() throws Exception {
        assertThat(primeDecomp.factorList(9), is(asList(3, 3)));
    }

    @Test
    public void factors_should_return_string_in_ascending_order() throws Exception {
        assertThat(PrimeDecomp.factors(86240), is("(2**5)(5)(7**2)(11)"));
    }
}
