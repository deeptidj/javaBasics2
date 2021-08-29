package com.company.myCompany.basicJava.collectionsExamples;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String name;
    private int rows;
    private int seatsPerRow;
    List<Seat> seats =  new ArrayList<>();

    public Theatre(String name, int rows, int seatsPerRow) {
        this.name = name;
        this.rows =  rows;
        this.seatsPerRow = seatsPerRow;

        //inititalize seats
        int lastRow = 'A' + rows - 1;
        for (char rowNo = 'A'; rowNo <= lastRow; rowNo++) {
            for (int seatNo = 1; seatNo <= seatsPerRow; seatNo++) {
                Seat s = new Seat(rowNo+String.format("%02d",seatNo));
                seats.add(s);
            }

        }

    }
    String getName() {
        return this.name;
    }
    public boolean isReserved(Seat seat){
        return true;
    }
    public boolean reserveSeat(String seat) {
        Seat requestedSeat = null;
        for (Seat s: seats) {
            if (s.getSeatNo().equals(seat)) requestedSeat = s;
            break;
        }
        if (requestedSeat == null) {
            return false;
        }
        return true;
    }
    public void getSeats() {
        for (Seat seat :
                seats) {
            System.out.println(seat.getSeatNo());
        }
    }

private class Seat{
        String seatNo;

        public Seat(String seatNo) {
            this.seatNo = seatNo;

    }


    public String getSeatNo() {
        return seatNo;
    }


}

}
