public class CWH_15_PS3 {
    public static void main(String[] args) {
        //Problem1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem2
        String s_1 = "To Lower Case";
        s_1 = s_1.replace(' ','_');
        System.out.println(s_1);

        //Problem3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","Rika");
        System.out.println(letter);

        //Problem4
        String new1 = "My String  contains  double and triple spaces";
        System.out.println(new1.indexOf("  "));
        System.out.println(new1.indexOf("   "));
        //Output -1 means there is no such double or triple space

        //Problem5
        String letter1 = "Dear Ritika,\n\t This Java Course is nice.\n\t Thanks!";
        System.out.println(letter1);

    }

}
