import java.util.Scanner;

class GreatestNumber {
    static void main() {
        System.out.println("find greatest number betwwen three");
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number A:");
        float a=input.nextFloat();
        System.out.println("enter a number B:");
        float b= input.nextFloat();
        System.out.println("enter a number C:");
        float c= input.nextFloat();
        if(a>=b && a>=c){
            System.out.println(a+"is greatest number");
        }
        else if(b>=a && b>=c){
            System.out.println(b+"is greatest number");
        }
        else{
            System.out.println(c+"is greatest number");
        }
    }
}
