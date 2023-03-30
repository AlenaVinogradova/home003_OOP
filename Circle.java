public class Circle extends Figure{
    int r;

    public Circle(int r) {
        this.r = r;
        if (r<=0) System.out.println("no");
    }
    
    @Override
    public double area() {
        return Math.PI*r*r;
    }

    double circumference() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + r;
    }
    
}
