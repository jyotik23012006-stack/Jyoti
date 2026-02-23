import java.util.Scanner;

class FloatingNumbers {
    static void main() {
        Scanner input= new Scanner(System.in);

        System.out.println("Calculator for finding product of two floating number\n\n");

        System.out.print("enter a number A:");
        float a= input.nextFloat();
        System.out.print("enter a number B:");
        float b=input.nextFloat();
        System.out.println("product: "+ (a*b));
    }
}
