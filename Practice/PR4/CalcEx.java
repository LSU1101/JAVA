class CalcForStatic {
    public static int abs(int a) { return a > 0 ? a : -a; }
    public static int max(int a, int b) { return (a > b) ? a : b; }
    public static int min(int a, int b) { return (a > b) ? b : a; }
}

public class CalcEx {
    public static void main(String[] args) {
        System.out.println(CalcForStatic.abs(-5));
        System.out.println(CalcForStatic.max(10, 0));
        System.out.println(CalcForStatic.min(-3, -8));
    }
}
