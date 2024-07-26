public class CHW_10_Resulting_Data_Type {
    public static void main(String[] args) {
        byte x = 5;
        int y = 4;
        short z = 4;
        int a = x+y;
        double b = 6.78 + 6;
        System.out.println(a);
        System.out.println(b);

        //Increment & Decrement Operators
        int i = 56;
        System.out.println(i++);
        System.out.println(i);

        int j = 56;
        System.out.println(++j);
        System.out.println(j);

        int o = 7;
        int n = ++o * 8;
        System.out.println(n);

        char w = 'B';
        System.out.println(++w);
    }
}
