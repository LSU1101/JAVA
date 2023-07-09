import java.util.Scanner;

public class FindMultiplesInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        System.out.print("양의 정수 10개를 입력하세요>> ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (i == 0) {
                System.out.print("3의 배수는 ");
            }
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        scanner.close();
    }
}
