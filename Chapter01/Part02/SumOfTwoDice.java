public class SumOfTwoDice {
    public static void main(String[] args) {
        int SIDES = 6;

        int rand1 = (int) (Math.random() * SIDES + 1);
        int rand2 = (int) (Math.random() * SIDES + 1);

        int sum = rand1 + rand2;
        System.out.println(sum);
    }
}
