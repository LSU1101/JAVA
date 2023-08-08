import java.util.*;

public class MaxVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var v = new Vector<Integer>();
        int input;
        int max;

        System.out.print("정수(-1이 입력될 때까지)>> ");
        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            v.add(input);
        }

        var it = v.iterator();
        max = v.get(0);
        while (it.hasNext()) {
            int next = it.next();
            if (max < next) {
                max = next;
            }
        }

        System.out.println("가장 큰 수는 " + max);

        scanner.close();
    }
}
