public class RecursiveFunction {
    private static String reverse="";
    public static void main(String[] args) {
        System.out.println(reverserFunction("Hello"));

    }

   private static String reverserFunction(String check) {
       if (check.length()!=0) {
           reverse = reverse+check.charAt(check.length()-1);
           return reverserFunction(check.substring(0, check.length() - 1));
       } else return reverse;

    }
}
