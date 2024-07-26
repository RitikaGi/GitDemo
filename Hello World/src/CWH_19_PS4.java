import java.util.Scanner;
public class CWH_19_PS4 {
    public static void main(String[] args) {
        //Question 1
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }

        //Question 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Maths");
        byte x1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        byte x2 = sc.nextByte();
        System.out.println("Enter your marks in Physics");
        byte x3 = sc.nextByte();
        float average = (x1 + x2 + x3) / 3.0f;
        System.out.println("Your percentage is " + average);
        if (average >= 40 && x1 >= 33 && x2 >= 33 && x3 >= 33) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //Question 3
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Your Income in Lakhs");
        int income = sc.nextInt();
        float tax = 0;
        if (income <= 250000) {
            tax = tax + 0;
        } else if (income > 250000 && income <= 500000) {
            tax = tax + 0.05f * (income - 250000);
        } else if (income > 500000 && income <= 1000000) {
            tax = tax + 0.05f * (income - 250000);
            tax = tax + 0.20f * (income - 500000);
        } else if (income > 1000000) {
            tax = tax + 0.05f * (income - 250000);
            tax = tax + 0.20f * (income - 500000);
            tax = tax + 0.30f * (income - 1000000);
        }
        System.out.println("The tax paid on this income is :" + tax);
    }

    //Question 4
    Scanner sc5 = new Scanner(System.in);
    int day = sc5.nextInt();
        switch(day)

    {
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");

}





