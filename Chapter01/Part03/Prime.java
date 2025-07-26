public class Prime {
    public static void main(String[] args) {
        // Verify if n is prime
        // A prime number is an integer greater than 1 whose only positive divisors are 1 and itself
        long n = Long.parseLong(args[0]);
        int factor;
        for (factor = 2; factor <= n / factor; factor++) {
            if (n % factor == 0) {
                break;
            }
        }
        if (factor > n / factor) {
            System.out.println(n + " is prime");
        }else{
            System.out.println(n + " is not prime");
        }
    }
}
