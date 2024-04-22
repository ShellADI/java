/*Intializing two strings using constructor*/

class intializer{
    String a,b;
    intializer(String s1,String s2){
        a=s1;
        b=s2;
    }
}


public class stringConstructor {
    public static void main(String[] args) {
        intializer ob=new intializer("this is first string","this is second string");
        System.out.println("1st string: "+ob.a+"\n2nd string: "+ob.b);
    }
}
