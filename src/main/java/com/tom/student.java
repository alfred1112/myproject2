package com.tom;

public class student {
    String name ;
    int english;
    int math;
    public student(String name){
        this.name = name;
    }
    public student(String name ,int english,int math){
        this(name);
        //this.name=name;
        this.english = english;
        this.math = math;
    }
    public student(){
        this("John Doe",-1,-1);
        //name ="John Doe";
        //english = -1;
        //math = -1;
    }
    public void print(){
        System.out.print(name+"\t"+english+"\t"+math+"\t"+getAverage());
        if(getAverage() <60){
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage(){
        return(english+math)/2;
    }

}
