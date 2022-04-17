public class AccessPoint3d {
    public static void main(String[] args) {
        Point3d p1 = new Point3d(1,2, 2);
        Point3d p2 = new Point3d(0, -3, 2);
        Point3d p3 = new Point3d(1, 1, -4);
        Point3d p4 = new Point3d(1,2,3);

        //System.out.println(p1.x);
        Point3d.equation_plane(p1, p2, p3);
        Point3d.CheckPoint3d(p1, p2, p3, p4);


    }
}
