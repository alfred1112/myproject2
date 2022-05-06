package com.tom.score;

public class GraduateStudent extends student implements Printable {
    int thesis;
    public GraduateStudent(String name,
                           int english,
                           int math,
                           int thesis){
//    this.name = name;
//    this.english = english;
//    this.math = math;
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        super.print();
    }
    //    @Override
//    public void print(){
//        System.out.println(name+"\t"+english+"\t"+math+"\t"+getAverage()+"\t"+thesis);
//    }
}

