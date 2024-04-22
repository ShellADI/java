/*Conversion of String to character array*/

class A{
    String s;
    A(){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        sc.close(); 
    }
    void charToArray(){
        char[] ch=s.toCharArray();
        for(char i:ch) System.out.print(i+" ");
    }
}
public class matchString {
    public static void main(String[] args) {
        A ob=new A();
        ob.charToArray();
    }
}
