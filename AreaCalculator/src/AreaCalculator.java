public class AreaCalculator {

    public static void main(String[] args) {

        System.out.println(area(5));
        System.out.println(area(-5));

        System.out.println(area(5,6));
        System.out.println(area(-5,6));

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double circleRadius = Math.PI * (radius * radius);
        return circleRadius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        double rectangleArea = x * y;
        return rectangleArea;
    }
}
