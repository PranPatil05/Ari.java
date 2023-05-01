package PracticeProblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\Java\\Ari.java\\src\\PracticeProblems\\JavaWritetxt.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("Programming in Java !!!");
        bw.newLine();
        bw.write("Programming in Python !!!");
        bw.newLine();
        bw.write("Programming in c# !!!");

        bw.close();

        System.out.println("Finished !!!");
    }



}
