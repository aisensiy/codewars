import java.util.ArrayList;
import java.util.List;

public class PrimeDecomp {
    public List<Integer> factors(int n) {
        List<Integer> list = new ArrayList<Integer>();
        if (n <= 2) {
            list.add(n);
        } else {
            for (int i = 2; i < n; i++) {
                while (n > 2 && n % i == 0) {
                    list.add(i);
                    n = n / i;
                }
            }
            if (n > 1) {
                list.add(n);
            }
        }
        return list;
    }
}
