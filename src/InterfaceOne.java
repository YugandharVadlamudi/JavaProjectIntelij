interface IOne{
    void iOne();
}

interface ITwo extends IOne {
    void iTwo();
}
class MainCheck{
    public static void main(String[] args) {
        IOne iTwo=new IOne() {
            @Override
            public void iOne() {
                System.out.println("MainCheck.iOne");
            }
        };
//        iTwo.iOne();
    }
}