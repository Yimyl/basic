package cn.edu.bjtu.File.day02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String s = br.readLine();
        System.out.println(s);
        while((s = br.readLine()) != null){
            System.out.println(s);
        }
        br.close();
    }

}
