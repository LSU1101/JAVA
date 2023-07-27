import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

class StringStack implements Stack {
    private String[] stack;
    private int topOfStack;

    public StringStack(int capacity) {
        stack = new String[capacity];
        topOfStack = -1;
    }

    @Override
    public int length() {
        return topOfStack + 1;
    }

    @Override
    public int capacity() {
        return stack.length;
    }

    @Override
    public String pop() {
        if (topOfStack == -1) {
            return null;
        }

        String string = stack[topOfStack];
        topOfStack--;
        return string;
    }

    @Override
    public boolean push(String val) {
        if (topOfStack == capacity() - 1) {
            return false;
        } else {
            topOfStack++;
            stack[topOfStack] = val;
            return true;
        }
    }
}

public class StackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력>> ");
        int size = scanner.nextInt();

        StringStack stack = new StringStack(size);

        while (true) {
            String input;
            System.out.print("문자열 입력>> ");
            input = scanner.next();

            if (input.equals("그만")) {
                break;
            }

            if (stack.push(input)) {
                continue;
            } else {
                System.out.println("스택이 꽉 차서 푸시 불가");
                continue;
            }
        }

        System.out.print("스택에 저장된 모든 문자열 팝: ");
        int length = stack.length();
        for (int i = 0; i < length; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
