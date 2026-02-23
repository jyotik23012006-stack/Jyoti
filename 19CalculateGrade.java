import java.util.Scanner;

class CalculateGrade {
    static void main() {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Grade Calculator");
        System.out.print("enter percentage to find out grade:");
        float per=input.nextFloat();
        if(per>=90 ){
            System.out.println("Grade :A");
        }
        else if (per>=75 ){
            System.out.println("Grade :B");
        }
        else if(per>=60 ){
            System.out.println("Grade :C");
        }
        else if(per>=30 ){
            System.out.println("Grade :D");
        }
        else if(per>=0 ){
            System.out.println("Grade :E");
        }


    }
}
