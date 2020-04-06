public class Trapeze extends Figure {
    private String color;
    private double basic1;
    private double basic2;
    private double height;

    public Trapeze(double basic1, double basic2, double height, String color) {
        this.basic1 = basic1;
        this.basic2 = basic2;
        this.height = height;
        this.color = color;
    }

    public String color() {
        return color;
    }

    public double area() {
        return height * (basic2 + basic1) / 2;
    }

    public double perimeter() {
        return basic1 + basic2 + 2 * side();
    }

    public void print() {
        System.out.println("Figure: " + this.getClass() + "\nColor:" + this.color + "\nBasics: " + this.basic1 + "/"
                + this.basic2 + "\nHeight: " + this.height + "\nArea:" + this.area()
                + "\nPerimeter: " + this.perimeter());
    }

    private double side() {
        double triangleSide = Math.abs(basic1 - basic2) / 2;
        return Math.sqrt(Math.pow(triangleSide, 2) + Math.pow(height, 2));
    }
}
