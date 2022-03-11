package com.tom;

public class student {
    String name ;
    int english;
    int math;
    public student(String name){
        this.name = name;
    }
    public student(String name ,int english,int math){
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public student(){

    }
    public void print(){
        System.out.println(name+"\t"+english+"\t"+math);
    }

}
