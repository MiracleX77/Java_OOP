public class Testmin {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i < 150; i++) {
            sum += BBPpi(i);

        }
        System.out.println(sum);

    }

    static double BBPpi(int n) {
        double pi = ((16 ^ -n) * (4.0 / (8.0 * (double) n + 1.0) - 2 / (8.0 * (double) n + 4.0)
                - 1 / (8.0 * (double) n + 5.0) - 1.0 / (8.0 * (double) n + 6.0)));
        return (pi);
    }

}
