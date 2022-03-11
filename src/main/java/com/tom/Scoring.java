package com.tom;

public class Scoring {
    public static void main(String[] args) {
        student jack = new student("jack",70,88);
        //jack.name = "jack";
        //jack.english = 70;
        //jack.math = 88;
        student hank = new student("hank",30,80);
        GraduateStudent jane = new GraduateStudent("jane",50,80,50);
        jane.name ="jane";
        jack.print();
        hank.print();
        jane.print();
    }
}
