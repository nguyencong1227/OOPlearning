// Java program to find GCD and LCM of two numbers
class Bai1
{
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    // Recursive function to return lcm of a and b
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }


    // Driver method
    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
    }
}
