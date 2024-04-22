/*Initializing string and integer types using constructor */

class intializer{
    String a;
    int i;
    float f;
    double d;
    long l;
    short s;
    intializer(){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        a=sc.nextLine();
        System.out.print("Enter an integer: ");
        i=sc.nextInt();
        System.out.print("Enter a float value: ");
        f=sc.nextFloat();
        System.out.print("Enter a double value: ");
        d=sc.nextDouble();
        System.out.print("Enter a long integer: ");
        l=sc.nextLong();
        System.out.print("Enter a short interger: ");
        s=sc.nextShort();
        sc.close();
        System.out.println();
    }
}


public class stringIntConstructor {
    public static void main(String[] args) {
        intializer ob=new intializer();
        System.out.println("String: "+ob.a);
        System.out.println("Integer: "+ob.i);
        System.out.println("Float: "+ob.f);
        System.out.println("Double: "+ob.d);
        System.out.println("Long Integer: "+ob.l);
        System.out.println("Short Integer: "+ob.s);
    }
}
