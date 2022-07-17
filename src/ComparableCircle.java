import javafx.scene.shape.Circle;

public class ComparableCircle extends Circle
        implements Comparable<comparableCircle> {
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled){
        super(radius, color, filled);
    }

    public ComparableCircle() {

    }

    @Override
    public int compareTo(comparableCircle o) {
        if(getRadius()> o.getRadius()) return -1;
        else return 1;
        return 0;
    }
}
