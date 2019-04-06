package cn.edu.bjtu.API.day02;

public class GenericInterfaceImpl implements GenericInterface<String>{

    @Override
    public void method(String i) {
        System.out.println(i);
    }
}
