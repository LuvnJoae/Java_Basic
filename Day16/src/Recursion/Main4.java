package Recursion;

import java.io.File;
import java.io.FileFilter;

public class Main4 {
    public static void main(String[] args) {
        File file = new File("D:\\Java projects");
        prinDir(file);
    }
    public static void prinDir(File dir){
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });

        for (File file : files) {

            if (file.isFile()){
                System.out.println("文件名: " + file.getAbsolutePath());
            }else {
                System.out.println("目录名: " +file.getAbsolutePath());
                prinDir(file);
            }
        }
    }
}
