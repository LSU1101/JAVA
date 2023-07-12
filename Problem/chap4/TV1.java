public class TV1 {
    String brand;
    int year, inch;

    TV1(String brand, int year, int inch) { this.brand = brand; this.year = year; this.inch = inch; }

    public void show() {
        System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
    }

    public static void main(String[] args) {
        TV1 myTV1 = new TV1("LG", 2017, 32);
        myTV1.show();
    }
}
