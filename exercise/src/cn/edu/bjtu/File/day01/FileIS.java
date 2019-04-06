package cn.edu.bjtu.File.day01;

import java.io.*;
import java.util.Arrays;

public class FileIS {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test2.txt");
        byte a[] = new byte[10];
        int i = fis.read(a);
        System.out.println(new String(a,0,i));
        fis.close();
    }
    public static void method() throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        File f = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write("里\n".getBytes());
        fos.close();
        byte a[] = new byte[3];
        a[0] = (byte)fis.read();
        a[1] = (byte)fis.read();
        a[2] = (byte)fis.read();
        System.out.println(fis.read());
        System.out.println((byte)fis.read());
        String s = new String(a);
        System.out.println(s);
        //System.out.println(a[3]);
        fis.close();
    }
}
