import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProdFibTest {
    @Test
    public void should_return_0_1_1_given_0() throws Exception {
        assertThat(ProdFib.productFib(0), is(new long[]{0, 1, 1}));

    }
}