package com.tom.score;

public class ng {
    public static void main(String[] args) {
        String [] names = {"Brian","Karen","Eenny","Benny","Peter"};
        int [] english = {50,40,70,60,80};
        int [] maths = {70,55,98,64,83};
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]+"\t"+maths[i]+"\t"+english[i]+"\t"+(maths[i]+english[i])/2);
        }


    }
}
