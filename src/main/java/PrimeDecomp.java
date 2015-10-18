import java.util.ArrayList;
import java.util.List;

public class PrimeDecomp {
    public List<Integer> factors(int n) {
        List<Integer> list = new ArrayList<Integer>();
        if (n == 1) {
            list.add(1);
        } else {
            if (n % 2 == 0) {
                list.add(2);
                n = n / 2;
            }
            list.add(n);
        }
        return list;
    }
}
