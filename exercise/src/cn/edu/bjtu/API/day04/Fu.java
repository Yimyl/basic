package cn.edu.bjtu.API.day04;


public class Fu {
    public void m1(){}
}
class Zi extends Fu{
    public void m1 (){
        try {
            throw new Exception("as");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
