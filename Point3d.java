public class Point3d extends Point {
    public Point3d(){

    };

    double z;

    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }


    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    // Function to find equation of plane.
    static void equation_plane(Point3d P1, Point3d P2, Point3d P3)
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
        double d = (- a * P1.x - b * P1.y - c * P1.z);
        System.out.println("equation of plane is " + a +
                            " x + " + b + " y + " + c +
                            " z + " + d + " = 0.");
        
    }

    static void CheckPoint3d(Point3d P1, Point3d P2, Point3d P3, Point3d P4){
        double a1 = P2.x - P1.x;
        double b1 = P2.y - P1.y;
        double c1 = P2.z - P1.z;
        double a2 = P3.x - P3.x;
        double b2 = P3.y - P1.y;
        double c2 = P3.z - P1.z;
        double a = b1 * c2 - b2 * c1;
        double b = a2 * c1 - a1 * c2;
        double c = a1 * b2 - b1 * a2;
        double d = (- a * P1.x - b * P1.y - c * P1.z);
        if (a * P4.x + b * P4.y + c * P4.z + d == 0) System.out.println("This point is in the plane");
        else System.out.println("This point isn't in the plane");
    }

}
