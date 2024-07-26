import java.util.Scanner;
public class CWH_18_ElseIf {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        /*
        if(age>56){
            System.out.println("You are Experienced");
        }
        else if(age>48){
            System.out.println("You are less experienced");
        }
        else if(age>36) {
            System.out.println("You are very less experienced");
        }
        else{
            System.out.println("You are not experienced");
        }

         */
          //Enhance switch case
        switch (age) {
            case 18 -> System.out.println("You are an adult");
            case 23 -> System.out.println("You are good to go for a job");
            case 60 -> System.out.println("You are a senior citizen");
            default -> System.out.println("Enjoy babe");
        }
        System.out.println("Thanks to learn this Java Program");
    }
}
