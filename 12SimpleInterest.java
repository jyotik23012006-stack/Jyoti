import java.util.Scanner;

class SimpleInterest {
    static void main() {
        System.out.println();
        System.out.println("calculator for finding simple interest");
        Scanner input=new Scanner(System.in);
        System.out.print("enter interest rate: ");
        float r=input.nextFloat();
        System.out.print("enter principle amount:");
        float p=input.nextFloat();
        System.out.print("enter time period in year:");
        float t=input.nextFloat();

        double a=(p*r*t)/100;
        System.out.println("simple interest:"+a);

    }
}
