package main;
import etc.Calc;

public class MainApp {
    public static void main(String[] args) {
        Calc calc = new Calc(10, 20);
        System.out.println(calc.sum());
    }
}
