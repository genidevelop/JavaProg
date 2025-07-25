public class LargestPowerOfTWo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int power = 1;
        while (power <= n / 2) {
            power *= 2;
        }
        System.out.println(power);
    }
}
