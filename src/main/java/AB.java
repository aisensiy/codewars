import java.util.stream.Stream;

public class AB {
    public String createString(int n, int k) {
        if (k > max(n)) {
            return "";
        }

        char[] str = createAllACharArray(n);

        int maxIndex = n - 1;
        while (k != 0) {
            if (k >= maxIndex) {
                str[maxIndex] = 'B';
                k -= count(str);
                maxIndex--;
            } else {
                str[k + 1] = 'B';
                break;
            }
        }

        System.out.println(str);
        return new String(str);
    }

    private char[] createAllACharArray(int n) {
        return new String(new char[n]).replace("\0", "A").toCharArray();
    }

    private double max(int n) {
        double sqrtValue = Math.floor(Math.sqrt(n));
        return sqrtValue * (n - sqrtValue);
    }

    public int count(char[] chars) {
        int sum = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] != 'A') continue;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == 'B') {
                    sum++;
                }
            }
        }
        return sum;
    }
}
