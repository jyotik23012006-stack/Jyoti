import java.util.Scanner;

class ArithmaticOperators {
    static void main() {
        System.out.println("performing arithmetic operations on two number \n\n");
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number A:");
        int a=input.nextInt();
        System.out.print(a);
        System.out.print("enter a number B:");
        int b=input.nextInt();
        System.out.println(b);
        System.out.println("performing operations:");
        int c=a+b;
        System.out.println("addition:"+ c);
        int d=a-b;
        System.out.println("subtraction:"+d);
        int e=a*b;
        System.out.println("multiplication:"+e);
        int f=a/b;
        System.out.println("division:"+f);
        int g=a%b;
        System.out.println("remainder:"+g);

    }
}
