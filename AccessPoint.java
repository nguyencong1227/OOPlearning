public class AccessPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 6);
        Point p3 = new Point(0, 9);

        Point.CheckPoint(p1, p2, p3);
        System.out.println("Distance between p1 and p2 is: " + Point.distance(p1, p2));
        System.out.println("Distance between p1 and p2 is: " + Point.distance(p2, p3));
        System.out.println("Distance between p1 and p2 is: " + Point.distance(p3, p1));
    }
}
