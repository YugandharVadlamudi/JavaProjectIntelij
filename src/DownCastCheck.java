class SuperClass implements  Check{
    void sound() {
        System.out.println("Sound Super");
    }

    @Override
    public void checkMethod() {
        System.out.println("Super Class ");
    }
}
class SubClass extends SuperClass implements Check{
    void sound() {
        super.sound();
        System.out.println("Sound SubClass");
    }

    @Override
    public void checkMethod() {
//        super.checkMethod();
        System.out.println("SubClass Interface ");
    }
}
interface Check{
    void checkMethod();
}
public class DownCastCheck {
    public static void main(String[] args) {
//        Sub method will call
        SuperClass superClass =new SubClass();
        superClass.checkMethod();
        SuperClass superClass1 = new SuperClass();
        SubClass subClass = new SubClass();
        superClass1 = subClass;
        superClass1.checkMethod();
        subClass.checkMethod();

        /*SubClass subClass = (SubClass) new SuperClass();
        subClass.sound();*/
        int a = 1;
        String b = "1";
        int c = 2;
//        System.out.println(a==b);
    }
}
