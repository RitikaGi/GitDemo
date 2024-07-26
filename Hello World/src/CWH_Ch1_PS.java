import java.util.Scanner;

public class CWH_Ch1_PS {
    public static void main(String[] args) {
        // Question1
        int num1 = 45;
        int num2 = 56;
        int num3 = 50;
        int sum = num1 + num2 + num3;
        System.out.print("The sum of these numbers is = ");
        System.out.println(sum);

      // Questions2
        float a = 59;
        float b = 98;
        float c = 80;
        float cgpa = (a +b +c)/30;
        System.out.print("cgpa of these numbers is =");
        System.out.println(cgpa);

     // Question3
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + ", Have a good day!");

     // Question4
        System.out.println("Enter your value in kilometer");
        Scanner sc0 = new Scanner(System.in);
        double kilometer = sc.nextDouble();
        double miles = kilometer/1.609;
        System.out.println(miles + " miles");



     //Question5
        System.out.println("Enter your number =");
        Scanner sc1 = new Scanner(System.in);
        System.out.println(sc.hasNextInt());

    }
}
