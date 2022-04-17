public class AccessPoint3d {
    public static void main(String[] args) {
        Point3d p1 = new Point3d(1, 1, 1);
        Point3d p2 = new Point3d(1, 6, 4);
        Point3d p3 = new Point3d(0, 9, 6);
        Point3d p4 = new Point3d(1,2,3);

        equation_plane(p1, p2, p3);
        CheckPoint3d(p1, p2, p3, p4);


    }
}
