package cn.edu.bjtu.File.day01;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.getPath().indexOf("Demo")>=0)return true;
        return false;
    }
}
