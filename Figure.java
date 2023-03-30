public abstract class Figure implements Area, Comparable<Figure> {
    // double figureArea = area();
    
    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.area(), o.area());
    }


    // @Override
    // public int compareTo(Figure o) {
    //     if (this.figureArea > o.figureArea) 
    //         return 1;
    //     else if (this.figureArea < o.figureArea) return -1;
    //     else return 0;
    // }
}
