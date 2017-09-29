package com.JavaLearning.JavaSELearning.IO;

import java.io.*;

public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        try {
            FileInputStream in = new FileInputStream("E:\\IDEAPro\\IdeaProjects\\Something\\src\\com\\JavaLearning\\JavaSELearning\\IO\\TestFileInput.java");
            FileOutputStream out = new FileOutputStream("E:\\IDEAPro\\IdeaProjects\\Something\\src\\com\\JavaLearning\\JavaSELearning\\IO\\TestFileOutput.java");
            while ((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
