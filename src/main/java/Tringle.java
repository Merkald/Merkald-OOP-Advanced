public class Tringle extends Figure {
    private double side1;
    private double side2;
    private double side3;
    private String color;

    public Tringle(long side1, long side2, long side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }


    public String color() {
        return color();
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

    public void print() {
        System.out.println("Figure: " + this.getClass() + "\nColor:" + this.color + "\nSides: " + this.side1 + "/"
                + this.side2 + "/" + this.side3 + "\nArea:" + this.area()
                + "\nPerimeter: " + this.perimeter());
    }
}
