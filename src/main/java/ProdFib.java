import java.util.ArrayList;
import java.util.List;

public class ProdFib {
    public static long[] productFib(int n) {
        long first = 0L;
        long second = 1L;
        while (first < n / second) {
            long temp = first + second;
            first = second;
            second = temp;
        }
        return new long[]{first, second, first == n / second ? 1L : 0L};
    }
}
