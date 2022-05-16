public class vectormain {
    public static void main(String[] args)
    {
        double[] arr =  new double[] {1, 2, 3};
        double[] arr2 =  new double[] {4, 5, 6};
        vector x = new vector(arr, arr.length);
        vector y = new vector(arr2, arr2.length);
        vector z = new vector(arr, arr.length);

        z.cong(x, y, z);
        //x.display();
        System.out.println(z.toString());

    }
}
