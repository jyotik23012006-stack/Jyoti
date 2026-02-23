import java.sql.SQLOutput;
import java.util.Scanner;

class perimeterRectangle {
    static void main() {
        System.out.println("calculator for finding area of rectangle");
        Scanner input=new Scanner(System.in);
        System.out.print("length of rectangle L:");
        float l=input.nextFloat();
        System.out.print("breadth of rectangle B;");
        float b=input.nextFloat();

        float c=2*(l+b);

        System.out.println("perimeter of rectangle:"+c);

    }
}
