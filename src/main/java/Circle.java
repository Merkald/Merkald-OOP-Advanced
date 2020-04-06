public class Circle extends Figure {
    private long radius;
    private String color;

    public Circle(long radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String color() {
        return color;
    }

    public double area() {
        return (Math.PI * radius * radius);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void print() {
        System.out.println("Figure: " + this.getClass() + "\nColor:" + this.color + "\nRadius: " + this.radius + "\nArea:"
                + this.area() + "\nPerimeter: " + this.perimeter());
    }
}
