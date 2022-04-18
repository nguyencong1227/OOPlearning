public class LinkedStackDemo {

    public static Integer[] reverse(Integer[] a){
        Stack s = new LinkedStack();

        Integer[] b = new Integer[a.length];
        for (int i=0; i<a.length;i++) s.push(a[i]);

        for (int i=0; i<a.length;i++) b[i] = (Integer)(s.pop());
        return b;
    }

    public static void main(String[] args){
        Integer a[] = new Integer[args.length];

        for (int i = 0; i<a.length; i++) a[i]=Integer.parseInt(args[i]);

        System.out.println("Day so nhap vao stack la:");
        for(int i=0;i<a.length; i++) System.out.print((a[i] + " "));
        System.out.println();

        Integer[] b = reverse(a);

        for(int i=0;i<b.length; i++) System.out.print(b[i]+ " ");
        System.out.println();
    }
    
}
