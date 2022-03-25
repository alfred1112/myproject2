package com.tom.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_STATION, Station.KAOHSIUNG_STATION);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1.Taipei,2.Taichung,3.Kaohsiung)");
        Station starStation = null;
        int choice = Integer.parseInt(scanner.next());
        choice =
                switch (choice) {
                    case 1:
                        System.out.println();
                        break;
                    case 2 :
                        System.out.println();
                        break;
                    case  3:
                        System.out.println();
                        break;
                    default:
                        System.out.println();
                        break;

                }



    }
}
