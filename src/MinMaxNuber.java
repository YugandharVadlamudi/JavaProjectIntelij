import java.util.Arrays;

public class MinMaxNuber {
    public static void main(String[] args) {
        int[] minMaxArray = {20, 5, 30, 0};
        int max = minMaxArray[0];
        int min = minMaxArray[0];
        for (int a : minMaxArray) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        int firtMin = Integer.MAX_VALUE, secoundMin = Integer.MAX_VALUE;
        for (int a : minMaxArray) {
            if (a < firtMin) {
                secoundMin=firtMin;
                firtMin=a;
            } else if (a < secoundMin) {
                secoundMin = a;
            }
        }

        System.out.println("MinMaxNuber.main" + max + "Min->" + min + "secound min " + secoundMin);
        System.out.println("args = firstmin"+firtMin+"Second Min"+secoundMin );
    }
}
