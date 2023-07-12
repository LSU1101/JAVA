public class ThreeSixNine {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.print(i + " 박수 짝");
                if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                    if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                        System.out.print("짝");
                    }
                }
                System.out.println();
            }
        }
    }
}