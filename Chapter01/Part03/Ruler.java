public class Ruler {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        String ruler = "1 ";
        for (int i = 2; i <= n; i++) {
            ruler = ruler + i + " " + ruler;
        }
        System.out.println(ruler);
    }
}
