import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Calc {
    protected int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract int calculate();
}

class Add11 extends Calc {
    public int calculate() {
        return a + b;
    }
}

class Sub11 extends Calc {
    public int calculate() {
        return a - b;
    }
}

class Mul11 extends Calc {
    public int calculate() {
        return a * b;
    }
}

class Div11 extends Calc {
    public int calculate() {
        return a / b;
    }
}

public class Calculator {
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
                    Add11 add = new Add11();
                    add.setValue(a, b);
                    System.out.println(add.calculate());
                    break;
                case "-":
                    Sub11 sub = new Sub11();
                    sub.setValue(a, b);
                    System.out.println(sub.calculate());
                    break;
                case "*":
                    Mul11 mul = new Mul11();
                    mul.setValue(a, b);
                    System.out.println(mul.calculate());
                    break;
                case "/":
                    Div11 div = new Div11();
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
