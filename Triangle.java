public class Triangle extends Polygon{
    int a;
    int b;
    int c;
    
    public Triangle(int a, int b, int c) {
        super(new int[] {a,b,c});
        this.a = a;
        this.b = b;
        this.c = c;
        if((a+b)<c && (a+c)<b && (b+c)<a) System.out.println("nono");

    }

    @Override
    public double area() {
        // double pp = (double)super.perimeter()/2;
        double pp = (double)perimeter()/2;
        return Math.sqrt((pp*(pp-a)*(pp-b)*(pp-c)));
    }

    @Override
    public String toString() {
        return String.format("Triangle with sides: %d, %d, %d", a, b, c);
    }
}
