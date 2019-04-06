package cn.edu.bjtu.day10;

public class Zi extends Fu{
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.getClass());
        System.out.println(((Zi)f).getClass());
    }
     //int age;
     final static int num = 20;
     public Zi(){
         age = 20;
         System.out.println(":"+super.age);
        //this(10,10); System.out.println("???");

    }
    public void change(){
         age = 30;
    }

    //@Override
    void method(){
        System.out.println(age);
        System.out.println(num);
    }
    private Zi(int age,int num){
        System.out.println("...");
         this.age = age;
    }
    public void me(){
        System.out.println(age);
        System.out.println(num);
    }
}
