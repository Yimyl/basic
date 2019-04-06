package cn.edu.bjtu.Last;

public class Person {
    public int age;
    public String name;
    public static int num = 1;
    private String a;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", a='" + a + '\'' +
                '}';
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }



    public Person() {
    }

    public Person(int age, String name, String a) {
        this.age = age;
        this.name = name;
        this.a = a;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void method(){
        System.out.println("hellio");
    }
}
