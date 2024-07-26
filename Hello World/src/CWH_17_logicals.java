public class CWH_17_logicals {
    public static void main(String[] args) {
        System.out.println("For Logical AND");
        boolean a = true;
        boolean b = false;
        boolean c = false;
        if(a && b && c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("For Logical OR");
        boolean a1 = false;
        boolean b1 = false;
        boolean c1 = false;
        if(a1 || b1 || c1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("For Logical Not");
        System.out.print("Not(a1) is ");
        System.out.println(!a1);
        System.out.print("Not(b1) is ");
        System.out.println(!b1);
    }

}
