import java.util.Scanner;

class AreaTriangle {
    static void main() {
        System.out.println("calculator for finding area of triangle\n\n");
        Scanner input=new Scanner(System.in);
        System.out.print("enter the length of base:");
        float b= input.nextFloat();
        System.out.print("enter the length of base:");
        float l=input.nextFloat();

        double a=0.5*(l+b);
        System.out.println("Area of Triangle: "+a);

    }}
