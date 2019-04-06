package cn.edu.bjtu.day08;

public class Demo01 {
    public static void main(String[] args) {
        Student s1 = new Student("zzj",16);
        Student s2 = new Student("star",17);
        Student s3 = new Student("zjn",18);
        s1.cls = "rj1602";
        System.out.println(Student.cls);
        System.out.println(s3.cls);
        s2.cls = "rj1601";
        System.out.println(s1.cls);
        System.out.println(s2.cls);
        System.out.println(s3.cls);
    }
    static{
        System.out.println("Welcome!");
    }
}
