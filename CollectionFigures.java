import java.util.ArrayList;
import java.util.Collections;

public class CollectionFigures {

    ArrayList<Figure> figures = new ArrayList<>();
    

    void addFigure(Figure figure) {
        figures.add(figure);
    }

    void removeFigure(int i) {
        figures.remove(i);
    }

    Figure getFigure(int i) {
        return figures.get(i);
    }

    void showAllMethods() {
        for (Figure figure : figures) {
            System.out.println(figure);
            System.out.println("Area = " + figure.area());
            if (figure instanceof Perimeter) {
                System.out.println("Perimeter = " + ((Perimeter)figure).perimeter());
            }
            if (figure instanceof Circle) {
                System.out.println("Circumference = " + ((Circle)figure).circumference());
            }
            System.out.println();
        }
    }

    void sortArea() {
        Collections.sort(figures);
    }
    

}
