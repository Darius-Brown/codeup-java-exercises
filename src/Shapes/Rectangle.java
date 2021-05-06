package Shapes;

public class Rectangle {
    protected double length;
    protected double width;

    static double getArea(double length, double width){
        return (length * width);
    }

    static double getPerimeter(double length, double width){
        return (( 2 * length) + (2 * width));
    }
}
