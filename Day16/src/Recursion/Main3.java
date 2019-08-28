package Recursion;

import java.io.File;

public class Main3 {
    public static void main(String[] args) {
        File file = new File("D:\\Java projects");
        prinDir(file);
    }
    public static void prinDir(File dir){
        File[] files = dir.listFiles();

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
