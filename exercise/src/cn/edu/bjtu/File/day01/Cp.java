package cn.edu.bjtu.File.day01;

import java.io.*;

public class Cp {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        File fin = new File("G:\\DoyoGames\\Simple\\tuan");
        File fout = new File("C:\\Users\\zzj\\desktop\\temp");
        if(fout.exists() == false){
            fout.mkdir();
        }
        File f = fin.listFiles()[0];
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(new File(fout,"pic1"));
        byte[] b = new byte[1024];
        int len=0;
        while((len = fis.read(b,0,1024))!=-1){
            fos.write(b,0,len);
        }
        fis.close();
        fos.close();
        long e = System.currentTimeMillis();
        System.out.println("耗时"+(e-s)+"ms");
    }
}
