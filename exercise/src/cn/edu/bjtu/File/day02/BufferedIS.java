package cn.edu.bjtu.File.day02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedIS {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        byte c[] = new byte[5];
        int i;
        while((i = bis.read(c))!=-1){
            System.out.println(i);
            System.out.println(new String(c,0,i));
        }
        //System.out.println(c);
        bis.close();
    }
}
