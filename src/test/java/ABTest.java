import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ABTest {

    private AB ab;

    @Before
    public void setUp() throws Exception {
        ab = new AB();
    }

    @Test
    public void should_return_all_A_with_k_eq_0() throws Exception {
        assertThat(ab.createString(4, 0), is("AAAA"));
    }

    @Test
    public void should_return_last_B_with_k_eq_n_minus_1() throws Exception {
        assertThat(ab.createString(4, 3), is("AAAB"));
    }

    @Test
    public void should_return_last_two_B() throws Exception {
        assertThat(ab.createString(4, 4), is("AABB"));
    }

    @Test
    public void should_return_empty_given_k_too_big() throws Exception {
        assertThat(ab.createString(5, 8), is(""));
    }

    @Test
    public void test() throws Exception {
        assertThat(ab.count(ab.createString(10, 12).toCharArray()), is(12));
    }
}