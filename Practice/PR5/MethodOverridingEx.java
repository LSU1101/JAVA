class Shape5 {
    public Shape5 next;
    public Shape5() { next = null; }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line5 extends Shape5 {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect5 extends Shape5 {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle5 extends Shape5 {
    public void draw() {
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    static void paint(Shape5 p) {
        p.draw();
    }
    public static void main(String[] args) {
        Line5 line = new Line5();

        paint(new Shape5());
        paint(new Line5());
        paint(new Rect5());
        paint(new Circle5());
    }
}
