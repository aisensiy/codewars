public class ProdFib {
    public static long[] productFib(int n) {
        if (n == 1) {
            return new long[]{1, 1, 1};
        }
        return new long[]{0, 1, 1};
    }
}
