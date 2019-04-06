package cn.edu.bjtu.File.day01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Vector;

public class Property {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        prop.load(new FileReader("test.txt"));
        for(String key : prop.stringPropertyNames()){
            String s = prop.getProperty(key);
            System.out.println(s);
        }
    }
    public static void store()throws IOException {
        Properties prop = new Properties();
        prop.setProperty("zzj","168");
        prop.setProperty("star","160");
        prop.setProperty("zjn","169");
        FileWriter fw = new FileWriter("test.txt");
        prop.store(fw,"data");
//        for(String key : prop.stringPropertyNames()){
//            String s = prop.getProperty(key);
//            System.out.println(s);
//        }
        fw.close();
    }

}
