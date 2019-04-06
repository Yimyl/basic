package cn.edu.bjtu.File.day01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Red {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = new FileReader("test2.txt");
        int len = 0;
//        while((len = fr.read())!=-1){
//            System.out.println((char)len);
//        }
        char[] c= new char[100];
        try(fr){
            while((len = fr.read(c))!=-1){
                System.out.println(new String(c,0,len));
            }
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
