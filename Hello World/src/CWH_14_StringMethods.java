public class CWH_14_StringMethods {
    public static void main(String[] args) {
        String name = "Ritik";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String value1 = name.toLowerCase();
        System.out.println(value1);
        String value2 = name.toUpperCase();
        System.out.println(value2);
        String new_name = "     Ritik    ";
        String value3 = new_name.trim();
        System.out.println(value3);
        System.out.println(name.substring(1));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('i','n'));
        System.out.println(name.startsWith("Ri"));
        System.out.println(name.endsWith("ika"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("k"));
        System.out.println(name.indexOf("i",4));
        System.out.println(name.lastIndexOf("k"));
        System.out.println(name.lastIndexOf("i",2));
        System.out.println(name.equals("Riti"));
        System.out.println(name.equalsIgnoreCase("Ritik"));
    }
}
