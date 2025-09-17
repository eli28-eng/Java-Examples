public class Main {
    public static void main(String[] args) {
        System.out.println(getRandomHalf(100, 103));
    }

    public static int myRandom(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);
    }

    public static double getRandomHalf(int a, int b) {
        return (int) (Math.random() * (2*b - 2*a)) / 2.0 + a;
    }
}