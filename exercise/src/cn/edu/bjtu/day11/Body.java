package cn.edu.bjtu.day11;

public class Body {
    public class Heart{
        int num =20;
        public void beat(){
            System.out.println("蹦");
            setName("hh");
            System.out.println(Body.this.num);
            System.out.println(this.num);
        }
    }
    private String name;
    int num =10;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("waibulei");
    }

}
