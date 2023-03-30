
public class Program {
    public static void main(String[] args) {

        Figure krug = new Circle(1);
        Polygon pryamougol = new Rectangle(2, 4);
        Polygon treugol = new Triangle(2,3, 4);
        Polygon kvadr = new Square(3);

        CollectionFigures collect = new CollectionFigures();
        collect.addFigure(krug);
        collect.addFigure(pryamougol);
        collect.addFigure(treugol);
        collect.addFigure(kvadr);
        collect.addFigure(new Square(5));
        collect.removeFigure(3);
        
        collect.showAllMethods();

        collect.sortArea();
        System.out.println(collect.getFigure(0));
        System.out.println(collect.getFigure(1));
        System.out.println(collect.getFigure(2));
        System.out.println(collect.getFigure(3));


    }
    
}