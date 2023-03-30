public class Rectangle extends Polygon {
    int side1;
    int side2;

    public Rectangle(int side1, int side2) {
        super(new int[] {side1, side2, side1, side2});
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1 * side2;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with sides: %d, %d", side1, side2);
    }
    
}
