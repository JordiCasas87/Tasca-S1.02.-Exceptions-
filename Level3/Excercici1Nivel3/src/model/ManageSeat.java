package model;

import java.util.ArrayList;

public class ManageSeat {

    private ArrayList<Seat> listSeat;

    public ManageSeat() {
        this.listSeat = new ArrayList<>();
    }

    public ArrayList<Seat> getListSeat() {
        if (listSeat.isEmpty()) {
            System.out.println("No hay reservas!");
            return null;
        }
        return listSeat;
    }

    public void addSeat(Seat seat) {
        int findSeat = findOccupiedSeat(seat.getRowNumber(), seat.getSeatNumber());
        try {

            if (findSeat == -1) {
                listSeat.add(seat);
                System.out.println("Asiento añadido correctamente!");
            } else {
                throw new ExceptionSeatOccupied("Asiento ya reservado.");
            }
        } catch (ExceptionSeatOccupied error) {
            System.out.println(error.getMessage());
        }
    }

    public int findOccupiedSeat(int row, int seat) {

        for (int i = 0; i < listSeat.size(); i++) {
            if (((listSeat.get(i).getRowNumber() == row)
                    && ((listSeat.get(i).getSeatNumber() == seat)))) {
                return i;
            }
        }
        return -1;
    }

    public void deleteSeat(int row, int seat) {
        try {
            int findSeat = findOccupiedSeat(row, seat);
            if (findSeat != -1) {
                listSeat.remove(findSeat);
                System.out.println("Reserva eliminada!");
            } else {
                throw new SeatFreeException("Estas butacas no estan reservadas!");
                //código de try catch con su excepción.
            }
        } catch (SeatFreeException error) {
            System.out.println(error.getMessage());
        }
    }


    public void deleteAllSeat(String name) {
        for (int i = listSeat.size() - 1; i >= 0; i--) {
            if (((listSeat.get(i).getName().equalsIgnoreCase(name)))) {
                listSeat.remove(i);
            }
        }
        System.out.println("Reservas de " + name + " eliminadas.");
    }


}