import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProdFibTest {
    @Test
    public void should_return_0_1_1_given_0() throws Exception {
        assertThat(ProdFib.productFib(0), is(new long[]{0, 1, 1}));
    }

    @Test
    public void should_return_1_1_1_given_1() throws Exception {
        assertThat(ProdFib.productFib(1), is(new long[]{1, 1, 1}));
    }

    @Test
    public void should_return_1_2_1_given_2() throws Exception {
        assertThat(ProdFib.productFib(2), is(new long[]{1, 2, 1}));
    }

    @Test
    public void should_return_3_5_0_given_14() throws Exception {
        assertThat(ProdFib.productFib(14), is(new long[]{3, 5, 0}));

    }
}