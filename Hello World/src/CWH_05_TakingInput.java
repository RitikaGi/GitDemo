import java.util.Scanner;
public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 =");
        float a = sc.nextFloat();
        System.out.println("Enter num2 =");
        float b = sc.nextFloat();
        float sum = a +b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
    //   If we comment out line 6-13 then we can use boolean method to check the entered value is an integer or not as it shows true or false
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
   //   If we use the below function then we can enter any statement but we use only sc.next() then it will only print the first word of statement
        String str = sc.nextLine();
        System.out.println(str);


    }
}
