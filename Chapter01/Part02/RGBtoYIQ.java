public class RGBtoYIQ {
    // Converts from RGB Colors to YIQ Colors
    // Using The formula
    // y = 0.299 * (red / 255.0) + 0.587 * (green / 255.0) + 0.114 * (blue / 255.0);
    // i = 0.5959 * (red / 255.0) - 0.2746 * (green / 255.0) - 0.3213 * (blue /255.0);
    // q = 0.2115 * (red / 255.0) - 0.05227 * (green / 255.0) + 0.3112 * (blue /255.0);
    public static void main(String[] args) {
        int red = Integer.parseInt(args[0]);
        int green = Integer.parseInt(args[1]);
        int blue = Integer.parseInt(args[2]);

        // Normalizing RGB colors
        double normalizedRed = red / 255.0;
        double normalizedGreen = green / 255.0;
        double normalizedBlue = blue / 255.0;

        double y = 0.299 * normalizedRed + 0.587 * normalizedGreen + 0.114 * normalizedBlue;
        double i = 0.5959 * normalizedRed - 0.2746 * normalizedGreen - 0.3213 * normalizedBlue;
        double q = 0.2115 * normalizedRed - 0.05227 * normalizedGreen + 0.3112 * normalizedBlue;

        System.out.println("RGB " + red + " " + green + " " + blue + " to YIQ " + y + " " + i + " " + q);
    }
}
