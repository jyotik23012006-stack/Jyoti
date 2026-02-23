import java.util.Scanner;

class DetermineSignNumber {
    static void main() {
        System.out.println("find weather the given number is positive, negative or zero");
        Scanner input=new Scanner(System.in);
        System.out.print("enter any number:");
        int number=input.nextInt();
        if(number>0){
            System.out.println("Given number is positive");
        }
        else if (number<0){
            System.out.println("Givem number is negative");
        }
        else{
            System.out.println(("givem number is zero"));
        }
    }
}
