public class Square extends Figure {
    public double side;
    private String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    public String color() {
        return color;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }

    public void print() {
        System.out.println("Figure: " + this.getClass() + "\nColor:" + this.color + "\nSide: " + this.side
                + "\nArea:" + this.area() + "\nPerimeter: " + this.perimeter());
    }
}
