import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int[] intArray = new int[5];

        System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        System.out.println("평균은 " + (double)sum / intArray.length);
        scanner.close();
    }
}
