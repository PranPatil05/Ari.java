package PracticeProblems;

import java.io.*;
import java.util.Scanner;

public class ReadtxtFiles {
    public static void main(String[] args) throws IOException {
//        FileReader fr=new FileReader("C:\\Java\\Ari.java\\src\\PracticeProblems\\JavaReadtxt.txt");
//        BufferedReader br=new BufferedReader(fr);
//
//        String str;
//        while ((str = br.readLine())!=null){
//            System.out.println(str);
//        }
//
//        br.close();

        //Approach 2

        File file=new File("C:\\\\Java\\\\Ari.java\\\\src\\\\PracticeProblems\\\\JavaReadtxt.txt");

        Scanner sc=new Scanner(file);

        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
