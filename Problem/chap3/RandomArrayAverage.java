public class RandomArrayAverage {
    public static void main(String[] args) {
        int[] Array = new int[10];
        int sum = 0;

        System.out.print("랜덤한 정수들: ");
        for (int i = 0; i < Array.length; i++) {
            int random = (int)(Math.random() * 10 + 1);
            Array[i] = random;
            sum += Array[i];
            System.out.print(Array[i] + " ");
        }
        System.out.println("\n평균은 " + (double)sum / Array.length);
    }
}
