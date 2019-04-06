package cn.edu.bjtu.File.day01;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class Fil {
    public static void main(String[] args) {
        File f = new File("exercise\\src\\cn\\edu\\bjtu\\MuiltThread");
        f.exists();
            for(File s :f.listFiles((file,name)-> true)){
                System.out.println(s.getPath());
            }
//        for(File s : f.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                File s= new File(dir,name);
//                System.out.println(s.getPath());
//                return false;
//            }
//        })){
//
//        }
    }
    public static void create(){
        File f = new File("F:\\IdeaProjects\\basic\\exercise\\src\\cn\\edu\\bjtu\\MuiltThread");
        File f2 = new File("C:\\Users\\zzj\\desktop\\god\\link.txt");
        //System.out.println(f.exists());
        //System.out.println(f2.exists());
//        String[] s = f.list();
//        System.out.println(s);
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
        //System.out.println(f2.createNewFile());
//        try {
//            System.out.println(f.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(f.mkdir());
//        System.out.println(f2.mkdir());
//        System.out.println(f.delete());
        //System.out.println(f.delete());
        //System.out.println(f.delete());
    }

    public static void judge(){
        File f = new File("C:\\Users\\zzj\\desktop\\links.txt");
        File f2 = new File("exercise");
        System.out.println(f.exists());
        System.out.println(f2.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }

}
