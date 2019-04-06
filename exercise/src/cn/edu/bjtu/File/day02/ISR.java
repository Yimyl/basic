package cn.edu.bjtu.File.day02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISR {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("test2.txt"),"gbk");
        char[] c = new char[100];
        int l=0;
        l = isr.read(c);
        System.out.println(new String(c,0,l));
        isr.close();
    }
}
