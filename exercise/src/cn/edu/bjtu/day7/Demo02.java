package cn.edu.bjtu.day7;

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(fromArrayToString(arr));
    }
    public static String fromArrayToString(int[] arr){
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                s+="word"+arr[i]+"#";
            }else{
                s += "word" + arr[i] + "]";
            }
        }
        return s;
    }
}
