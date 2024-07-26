import java.util.Scanner;

public class CHW_11_Ex1_Sol {
    public static void main(String[] args)
    {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks of Maths =");
        float m = sc.nextFloat();
        System.out.println("Marks of Physics =");
        float p = sc.nextFloat();
        System.out.println("Marks of Chemistry =");
        float c = sc.nextFloat();
        System.out.println("Marks of Biology =");
        float b = sc.nextFloat();
        System.out.println("Marks of English =");
        float e = sc.nextFloat();
        float sum = m +p + c + b + e;
    //    System.out.println(sum);
        System.out.println("Enter total marks ::");
        float total_marks = sc.nextFloat();
        float percentage = ((sum / total_marks) * 100);
        System.out.println("Percentage of this student is=");
        System.out.println(percentage);

    }
}
