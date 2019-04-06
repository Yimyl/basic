package cn.edu.bjtu.day08;

public class Student {
    String name = "zzj";
    int age=0;
    static String cls;
    public void method(){
        System.out.println("student");
        return ;
    }
    public void student(){
        System.out.println(age);
    }
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getCls() {
        return cls;
    }

    public static void setCls(String cls) {
        Student.cls = cls;
    }
}
