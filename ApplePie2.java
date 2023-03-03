public class ApplePie2 {
    public static void main(String[] args) {
        int ilyaApples = 4;
        int sum = ilyaApples + askKatya() + askAnton() + askDima();
        System.out.println("Общее количество яблок: " + sum);
    }
    static int askKatya() {
        int apples = 5;
        return apples;
    }
    static int askAnton() {
        int apples = 3;
        return apples;
    }
    static int askDima() {
        int apples = 7;
        return apples;
    }
}
