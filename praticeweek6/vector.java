public class vector {
    protected int n;
    protected double[] mang = new double[n];
    public vector()
    {

    }
    public vector(int n)
    {
        this.n = n;
    }
    public vector(double[] mang, int n)
    {
        this.mang = mang;
        this.n = n;
    }

    public double dodai()
    {
        double x = 0;
        for(int i=0; i<n; i++)
        {
            x += mang[i] * mang [i];
        }
        return Math.sqrt(x);
    }

    public vector cong(vector x, vector y, vector z)
    {
        for(int i=0; i<n; i++)
        {
            z.mang[i] = x.mang[i] + y.mang[i];
        }
        return z;
    }

    public vector tru(vector x, vector y, vector z)
    {
        for(int i=0; i<n; i++)
        {
            z.mang[i] = x.mang[i] - y.mang[i];
        }
        return z;
    }

    public vector nhan(vector x, int m)
    {
        for(int i=0; i<n; i++)
        {
            x.mang[i] = x.mang[i] * m;
        }
        return x;
    }

    public vector chia(vector x, double m)
    {
        for(int i=0; i<n; i++)
        {
            x.mang[i] = x.mang[i] / m;
        }
        return x;
    }

    public vector vtdonvi(vector x)
    {
        return x.chia(x, x.dodai());
    }

    public String toString()
    {
        String s = "( ";
        for(int i=0; i<n; i++)
        {
            s += Double.toString(mang[i]) + " ";
        }
        s += ")";
        return s;
    }

    public void display()
    {
        System.out.print("Vector: ");
        for(int i=0; i<n; i++)
        {               
            System.out.print(mang[i] + " ");
        }
    }
}
