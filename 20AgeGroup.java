import java.util.Scanner;

class AgeGroup {
    static void main() {
        Scanner input= new Scanner (System.in );
        System.out.println("different age group indicator");
        System.out.print("enter age :");
        int age= input.nextInt();
       if(age>=60){
           System.out.println("senior");}
       else if (age>=20) {
           System.out.println("adult");}
       else if (age>=13){
           System.out.println("teen");}
       else if (age>=0){
           System.out.println("child");}
    }
}
