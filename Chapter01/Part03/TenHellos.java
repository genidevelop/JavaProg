public class TenHellos {
    public static void main(String[] args) {
        int lines = Integer.parseInt(args[0]);

        for (int i = 1; i <= lines; i++) {
            if ((i % 10 == 1 && i < 10) || (i % 10 == 1 && i >= 20) || i % 100 == 1) {
                System.out.println(i + "st Hello");
            } else if (i % 10 == 2 && i < 10 || i % 10 == 2 && i > 20 || i % 100 == 2) {
                System.out.println(i + "nd Hello");
            } else if (i % 10 == 3 && i < 10 || i % 10 == 3 && i > 20 || i % 100 == 3) {
                System.out.println(i + "rd Hello");
            } else {
                System.out.println(i + "th Hello");
            }
        }
    }
}