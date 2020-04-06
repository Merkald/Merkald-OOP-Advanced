public class Main {
    public static void main(String[] args) {
        FiguresList[] mass = new FiguresList[4];
        mass[0] = new FiguresList<Square>(new Square(10, "red"));
        mass[1] = new FiguresList<Circle>(new Circle(5, "black"));
        mass[2] = new FiguresList<Trapeze>(new Trapeze(5, 15, 10, "blue"));
        mass[3] = new FiguresList<Tringle>(new Tringle(3, 4, 6, "green"));

        for (FiguresList k : mass) {
            k.figure.print();
            System.out.println();
        }
    }
}
