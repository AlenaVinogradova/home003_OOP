public abstract class Polygon extends Figure implements Perimeter{
    int[] sides;

    public Polygon(int[] sides) {
        this.sides = sides;
        for (int i : sides) {
            if (i <=0) System.out.println("nonono");
        }
    }

    @Override
    public int perimeter() {
        int p = 0;
        for (int i : this.sides) {
            p+=i;
        }
        return p;
    }
}
