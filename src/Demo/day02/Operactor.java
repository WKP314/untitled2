package Demo.day02;

public class Operactor {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        int z=x+y;
        System.out.println(z);
        z=x-y;
        System.out.println(z);
        z=x*y;
        System.out.println(z);
        z=x/y;
        System.out.println(z);

        System.out.println(++x);
        System.out.println(x++);

        int a=1;
        int b=2;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}
