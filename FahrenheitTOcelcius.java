import java.util.Scanner;

class FahrenheitTOcelcius {
    static void main() {
        System.out.println();
        System.out.println("calculator to conver fahrenheit to celcius");
        Scanner input=new Scanner(System.in);
        System.out.print("enter temperature in fahrenheit:");
        int f=input.nextInt();

        float c=(f-32)*5/9;
        System.out.println("temperature in celcius:"+c);
    }
}
