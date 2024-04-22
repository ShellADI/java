/*Fabonacci series upto nth term */

class A{
    int a,j=0,k=1,l;
    A(){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        a=sc.nextInt();
    }
    void fabonacci(){
        System.out.print("Fabonacci series upto "+a+"th : 0 1 ");
        for(int i=1;i<=a-2;i++){
            l=j+k;
            j=k;
            k=l;
            System.out.print((l)+" ");
        }
    }
}

public class fabonacciSeries{
    public static void main(String[] args) {
        A ob=new A();
        ob.fabonacci();
    }    
}