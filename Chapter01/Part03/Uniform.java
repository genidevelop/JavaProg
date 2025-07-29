public class Uniform {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        double rand;

        for (int i = 0; i < n; i++) {
            rand = Math.random();
            sum += rand ;
            System.out.println(rand);
        }

        System.out.println("Average: " + sum / n);
    }
}
