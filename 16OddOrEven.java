import java.util.Scanner;

class OddOrEven {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("find if the given number is odd or even");
        System.out.println();
        System.out.print("enter any whole number :");
        int number= input.nextInt();
        if(number % 2==0){
            System.out.println("given number is even");}

            else if(number%2!=0){
                System.out.println("given number is odd");}

                else{
                    System.out.println("invalid input");
                }
            }

    }

