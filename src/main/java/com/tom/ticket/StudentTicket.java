package com.tom.ticket;

public class StudentTicket extends Ticket {
    float off = 0.2f;
    public StudentTicket(Station start ,Station destination){
        super(start, destination);
        price = price - (int)(price*off);

    }
}


//學生票8折