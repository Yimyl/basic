package cn.edu.bjtu.MuiltThread;

public class Product extends Thread{
    private Production p;
    String name;
    int count=1;
    public Product(String n,Production p){
        this.p=p;
        name =n;
    }

    public void run(){
        while(true){
           /* try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            Production production = new Production(count);
            synchronized(p){
                if(p.add(production)){

                    System.out.println(name+production.kind+production.color+"上货架。");
                    count =++count%2;

                    p.notifyAll();
                }else{
                    try {
                        System.out.println("货架上有"+p.size()+"个货了。");
                        System.out.println("货满了。不做了！");
                        p.notifyAll();
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }


        }
    }

}
