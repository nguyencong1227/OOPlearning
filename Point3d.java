public class Point3d extends Point{
    private double z;
    
    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3d(Point p) {
        this.x = p.x;
        this.y = p.y;
        this.z = p.z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    double getZ() {
        return this.z;
    }

    // Function to find equation of plane.
    static int equation_plane(Point3d P1, Point3d P2, Point3d P3)
    {
        double a1 = P2.x - P1.x;
        double b1 = P2.y - P1.y;
        double c1 = P2.z - P1.z;
        double a2 = P3.x - P3.x;
        double b2 = P3.y - P1.y;
        double c2 = P3.z - P1.z;
        double a = b1 * c2 - b2 * c1;
        double b = a2 * c1 - a1 * c2;
        double c = a1 * b2 - b1 * a2;
        double d = (- a * x1 - b * y1 - c * z1);
        System.out.println("equation of plane is " + a +
                            " x + " + b + " y + " + c +
                            " z + " + d + " = 0.");
        return a, b, c, d;
    }

    //static int equation_plane(Point3d P1, Point3d P2, Point3d P3)

}
