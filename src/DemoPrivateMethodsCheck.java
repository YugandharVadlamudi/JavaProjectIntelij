class DemoOnePrivate{
    private void one(){
        System.out.println("DemoOnePrivate.instance initializer");
    }
}
class DemoTwoPrivateCheck extends DemoOnePrivate{
    private void one() {
        System.out.println("DemoTwoPrivateCheck.one");
    }
}
public class DemoPrivateMethodsCheck {
    public static void main(String[] args) {
        DemoTwoPrivateCheck demoTwoPrivateCheck=new DemoTwoPrivateCheck();
    }
}

