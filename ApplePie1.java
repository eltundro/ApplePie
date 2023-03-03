public class ApplePie1 {
        static int sum = 0;
        static int askKatya() {
            int apples = 4;
            sum += apples;
            return apples;
        }
        static int askAnton() {
            int apples = 5;
            sum += apples;
            return apples;
        }
        static int askDima() {
            int apples = 6;
            sum += apples;
            return apples;
        }
        public static void main(String[] args) {
            int ilyaApples = 3;
            sum = ilyaApples;
            sum += askKatya() + askAnton() + askDima();
            System.out.println("Общее количество яблок: " + sum);
        }
    }
