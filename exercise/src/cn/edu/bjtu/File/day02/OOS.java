package cn.edu.bjtu.File.day02;

import java.io.*;

public class OOS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("p.txt",true));
//        Person p =new Person(20,"star");
//        oos.writeObject(new Person(18,"zzj"));
//        oos.writeObject(p);
//        oos.writeObject(new Person2(18,"zz"));
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p.txt"));
        Object o = ois.readObject();
        Person p1 = (Person )o;
        System.out.println(p1.getAge());
        System.out.println(p1.name);
        Object o2 = ois.readObject();
        Person p2 = (Person )o2;
        System.out.println(p2.getAge());

        System.out.println(p2.name);
        Person2 p3 = (Person2)ois.readObject();
        System.out.println(p3.getAge());
        System.out.println(p3.getName());
        Person2 p4 = (Person2)ois.readObject();
        System.out.println(p4.getAge());
        System.out.println(p4.getName());
        ois.close();

    }
}
