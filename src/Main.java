import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        List<String> a=new ArrayList<>();
        a.add("Hello1");
        a.add("Hello2");
        a.add("Hello3");
        for (int i = 0; i < a.size(); i++) {
            if (i == 2) {
                a.remove(i);
            }
        }
        System.out.println("the vlaue "+a.size());
        int i = 3;
//        String check=++i+","+i+","+i++;
        System.out.println("args = "+ ++i+","+i+","+i++);
    }


}
