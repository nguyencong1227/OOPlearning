import java.lang.Math.*;
public class sophuc {
    double phanthuc, phanao;

    public sophuc(double thuc, double ao){
        this.phanthuc = thuc;
        this.phanao = ao;
    }


    public static String toString(sophuc a){
        if (a.phanthuc == 0){
            return "jb";
        }
        else if (a.phanao == 0){
            return "a";
        }
        else{
            return "a + jb";
        }
    }

    public static sophuc add(sophuc a1, sophuc a2){
        sophuc res = new sophuc(0,0 );

        res.phanthuc = a1.phanthuc + a2.phanthuc;
        res.phanao = a1.phanao + a2.phanao;

        return res;
    }

    public static sophuc sub(sophuc a1, sophuc a2){
        sophuc res = new sophuc(0,0 );

        res.phanthuc = a1.phanthuc - a2.phanthuc;
        res.phanao = a1.phanao - a2.phanao;

        return res;
    }

    public static sophuc multiply(sophuc a1, sophuc a2){
        sophuc res = new sophuc(0,0 );

        res.phanthuc = a1.phanthuc*a2.phanthuc - a1.phanao*a2.phanao;
        res.phanao = a1.phanthuc*a2.phanao + a1.phanao*a2.phanthuc;

        return res;
    }

    public static double modun(sophuc a){
        double n;

        n = Math.sqrt(a.phanthuc*a.phanthuc + a.phanao*a.phanthuc);
        return n;
    }

    public static sophuc sub(sophuc a){
        sophuc res = new sophuc(0,0 );

        res.phanthuc = a.phanthuc;
        res.phanao = 0 - a.phanao;

        return res;
    }


    public void showC()
    {
        System.out.print(this.phanthuc + " +" + this.phanao + "i");
    }
    public static void main(String[] args){

        sophuc a = new  sophuc(1, 2);
        sophuc b = new sophuc(3, 4);
        double m;

        sophuc c = sophuc.add(a, b);
        sophuc d = sophuc.sub(a, b);
        sophuc e = sophuc.multiply(a, b);
        m = sophuc.modun(a);

        System.out.print("add: ");
        c.showC();
        System.out.println();
        System.out.print("sub: ");
        d.showC();
        System.out.println();
        System.out.print("mul: ");
        e.showC();
        System.out.println();
        System.out.println("modun: "+ m);

    }
}
