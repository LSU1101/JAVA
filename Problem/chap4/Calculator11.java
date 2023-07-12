import java.util.InputMismatchException;
import java.util.Scanner;

class Add {
    private int a ,b;
    public void setValue(int a, int b) {
        this.a = a; this.b = b;
    }

    public int calculate() {
        return a + b;
    }
}

class Sub {
    private int a ,b;
    public void setValue(int a, int b) {
        this.a = a; this.b = b;
    }

    public int calculate() {
        return a - b;
    }
}

class Mul {
    private int a ,b;
    public void setValue(int a, int b) {
        this.a = a; this.b = b;
    }

    public int calculate() {
        return a * b;
    }
}

class Div {
    private int a ,b;
    public void setValue(int a, int b) {
        this.a = a; this.b = b;
    }

    public int calculate() {
        return a / b;
    }
}

public class Calculator11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = 0, b = 0;
            String c;

            System.out.print("두 정수와 연산자를 입력하세요.>> ");
            try {
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.next();
            }
            catch (InputMismatchException e) {
                System.out.println("입력된 수는 정수가 아닙니다.");
                scanner.nextLine();
                continue;
            }

            switch (c) {
                case "+":
                    Add add = new Add();
                    add.setValue(a, b);
                    System.out.println(add.calculate());
                    break;
                case "-":
                    Sub sub = new Sub();
                    sub.setValue(a, b);
                    System.out.println(sub.calculate());
                    break;
                case "*":
                    Mul mul = new Mul();
                    mul.setValue(a, b);
                    System.out.println(mul.calculate());
                    break;
                case "/":
                    Div div = new Div();
                    div.setValue(a, b);
                    System.out.println(div.calculate());
                    break;
                default:
                    System.out.println("올바른 부호를 입력해주세요.");
                    continue;
            }
            break;
        }
        scanner.close();
    }
}
