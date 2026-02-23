import java.util.Scanner;

 class swap {
   public static void main() {
       Scanner input=new Scanner(System.in);
       System.out.println("welcome to swapping station");
       System.out.print("enter value of A:");
       int A=input.nextInt();
       System.out.print("enter value of B:");
       int B=input.nextInt();

       int C=A;
       A=B;
       B=C;

       System.out.println("enter value of A:"+A);
       System.out.println("enter value of B:"+B);

    }
}
