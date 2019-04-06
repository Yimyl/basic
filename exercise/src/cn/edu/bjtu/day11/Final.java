package cn.edu.bjtu.day11;

public class Final {
    public static void main(String[] args) {
//        final int  n = 1;
//        MyInterfaceImpl i = new MyInterfaceImpl();
//        final int m;
//        m=2;
//        System.out.println("ok");
//        final String s = "sdf";


        MyInterface inter = new MyInterface() {
            @Override
            public void method() {
                System.out.println("ss");
            }
        };
        System.out.println(inter.toString());
    }

}
