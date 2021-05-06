package Shapes;

public class Square extends Rectangle{
    protected double side;
        double length = side;
        double width = side;


        static double perimeter (double side){
            return 4 * side;
        }
        static double area (double side) {
            return side * side;
        }
}
