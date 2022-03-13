class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    //distance between two points
    public static double distance(Point p1, Point p2) {
        double distance;
        distance = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
        return distance;
    }

    // check if three points are collinear then print(collinear) else print area formed by the triangle of these three points
    public static void CheckPoint(Point p1, Point p2, Point p3) {
        double temp = p1.x * (p2.y - p3.y) + 
                    p2.x * (p3.y - p1.y) + 
                    p3.x * (p1.y - p2.y);

        if (temp == 0) 
            System.out.println("three points are collinear.");
        else
            System.out.println("Area is: " + temp);
    }

}