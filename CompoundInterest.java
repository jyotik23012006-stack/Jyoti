import java.util.Scanner;

class CompoundInterest {
    static void main() {
        System.out.println("calculator for CompoundInterest");
        Scanner input=new Scanner(System.in);
        System.out.print("enter rate of interest:");
        float r=input.nextFloat();
        System.out.print("enter the time period :");
        float t=input.nextFloat();
        System.out.print("enter the principle amount:");
        float p=input.nextFloat();

        double a=  p*Math.pow(1+r/100,t);
        System.out.println("compound interest:"+ a);

    }
}
