package cn.edu.bjtu.API.day02;

public class GenericClass<A> {
    private A name;

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }
    public <M> void method(M m){
        System.out.println(m);
    }
}
