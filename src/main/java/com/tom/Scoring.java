package com.tom;

public class Scoring {
    public static void main(String[] args) {
        student jack = new student("jack");
        //jack.name = "jack";
        jack.english = 70;
        jack.math = 88;
        student hank = new student("hank",60,80);
        jack.print();
        hank.print();
    }
}
