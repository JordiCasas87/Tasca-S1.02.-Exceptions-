package model;

import java.util.Objects;

public class Seat {

    private int rowNumber;
    private int seatNumber;
    private String name;


    public Seat(int rowNumber, int seatNumber, String name) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.name = name;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }


    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Seat seat)) return false;
        boolean rowNumberEqual = (rowNumber == seat.rowNumber && seatNumber == seat.seatNumber);

        return  rowNumberEqual;
    }
    
    @Override
    public String toString() {
        return "Seat{" +
                "rowNumber=" + rowNumber +
                ", seatNumber=" + seatNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
