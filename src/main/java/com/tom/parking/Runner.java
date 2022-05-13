package com.tom.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
//        String id = "13845747663"
        String enterTime = "08:00";
        String exitTime = "11:05";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        //Exception例外 vs Error錯誤
        Date d = null;
        try{
            d = sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)((d2.getTime()-d.getTime())/1000/60);
            System.out.println(mins);
            int fee = 30*(mins/60);
            System.out.println("Fee:"+fee);


            //3:14=> NTD$90 , 3:15 => NTD$120
            //3:15~3:30 => NTD$105
            int a = (int)(d.getTime()/1000/60)+15;//3:14=> NTD$90
            int b = (int)(d2.getTime()/1000/60);
            int pay ;
            int c= ((b-a)/60);
            if(c>=1){              //3:15 => NTD$120
                pay=30*(c+1);
                System.out.println(pay);
            }


        }catch (Exception e){
            System.out.println("exit wrong format");
        }
        //long ms = 3*60*60*1000;
        //d2.setTime(d.getTime()+ms);
    }
}
