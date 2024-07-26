import java.util.Scanner;
public class CHW_12_Ch2_PS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
