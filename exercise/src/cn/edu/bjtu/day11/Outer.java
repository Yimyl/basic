package cn.edu.bjtu.day11;

public class Outer {
    static int num1;
    public static void method(){
        int num =10;
        final int num2 = 10;
        int num3;
        num3 =5;
        final int num4;
        num4 =5;

        class Inner{
            public void methodInner(){
                System.out.println(num);
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num4);

            }
        }
    }
    class Inner1{
        public  void methodInner(){
            num1 = 10;

        }
    }
}
