package com.tom.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("score.txt");//throws
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            System.out.println(line);
        }catch (FileNotFoundException e){
            System.out.println("檔案讀取失敗");
        }catch (IOException e){
            System.out.println("檔案讀取失敗");
        }
        System.out.println("Testing");
    }
}
