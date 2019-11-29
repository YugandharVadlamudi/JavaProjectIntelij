/*abstract class DemoAbsract2 extends DemoAbsract implements YInterface  {
    abstract void demoAbstract();
    void demo(){
        System.out.println("DemoAbsract.demo");
    }


}

abstract class DemoAbsract {
    abstract void demoCheck();

    void deomo() {
        System.out.println("DemoCheck2.deomo");
    }
}
interface  YInterface{
    void yAbstract();
}*/

abstract  class Demo implements DemoInterface{
    @Override
    public void demo() {
        System.out.println("Demo.demo");
    }
}
interface DemoInterface{
    void demo();
}
public class AbstractClassExample {
    public static void main(String[] args) {
/*
        DemoAbsract2 demoAbsract2=new DemoAbsract2() {
            @Override
            void demoAbstract() {

            }

            @Override
            void demoCheck() {

            }

            @Override
            public void yAbstract() {

            }
        };
*/
//        demoAbsract2.demoCheck();
        Demo demo=new Demo() {
            @Override
            public void demo() {
                System.out.println("AbstractClassExample.demo");
            }
        };
        demo.demo();
    }
}
