public class YIQtoRGB {
    public static void main(String[] args) {
        double y = Double.parseDouble(args[0]);
        double i = Double.parseDouble(args[1]);
        double q = Double.parseDouble(args[2]);

        int red = (int) ((y + 0.956 * i + 0.621 * q) * 255.0);
        int green = (int) ((y - 0.272 * i - 0.647 * q) * 255.0);
        int blue = (int) ((y - 1.105 * i + 1.702 * q) * 255.0);

        red = Math.max(0, Math.min(255, red));
        green = Math.max(0, Math.min(255, green));
        blue = Math.max(0, Math.min(255, blue));

        System.out.println("YIQ " + y + " " + i + " " + q + " to RGB " + red + " " + green + " " + blue);
    }
}
