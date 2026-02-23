import java.util.Scanner;

class FindLeapYear {
    static void main() {
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to leap yeAR calculator:)");
        System.out.print("enter year:");
        int year= input.nextInt();
        if((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println(" leap year");
        }
        else{
            System.out.println("not a leap year");}

    }
}
