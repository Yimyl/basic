package cn.edu.bjtu.day09;

public class People {
    private int balance=20;
    private String name;

    public void show(){
        System.out.println(name+":"+balance);
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
