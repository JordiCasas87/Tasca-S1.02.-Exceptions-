package model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManageCine {

    static Scanner sc = new Scanner(System.in);

    private Cine cineNew;

    public ManageCine(Cine cineNew) {
        this.cineNew = cineNew;
    }

    public int menu() {
        int option=-1;
        try {
            System.out.println("***MENU GESTIÓN*** \n\n" +
                    "1.- Mostrar totes les butaques reservades.\n" +
                    "2.- Mostrar les butaques reservades per una persona.\n" +
                    "3.- Reservar una butaca.\n" +
                    "4.- Anul·lar la reserva d’una butaca.\n" +
                    "5.- Anul·lar totes les reserves d’una persona.\n" +
                    "0.- Sortir.");
            option = sc.nextInt();
            sc.nextLine();



        } catch (InputMismatchException e) {
            System.out.println("debe ser un numero entre 1 y 5!");
            sc.nextLine();
            }

        return option;
    }




    public ArrayList<Seat> getListSeats() {

        return cineNew.getSeatManager().getListSeat();
    }


    public void reservationSeat() {
        int row = insertRow();
        int seat = insertSeat();
        String name = insertName();
        Seat newSeat = new Seat(row, seat, name);
        cineNew.getSeatManager().addSeat(newSeat);
    }


    public int insertRow() {
        int row = -1;
        boolean validation = false;
        while (!validation) {
            System.out.println("Inserta la FILA del asiento: ");
            try {
                row = sc.nextInt();

                if ((row < 1) || (row > cineNew.getTotalRow())) {
                    throw new ExceptionWrongRow("Fila incorrecta!");
                } else {
                    System.out.println("Fila correcta.");
                    validation = true;
                }
            } catch (ExceptionWrongRow error) {
                System.out.println(error.getMessage());
            }
        }
        return row;
    }

    public int insertSeat() {
        int seat = -1;
        boolean validation = false;
        while (!validation) {
            System.out.println("Inserta el NUMERO del asiento: ");
            try {
                seat = sc.nextInt();
                sc.nextLine();

                if ((seat < 1) || (seat > cineNew.getTotalSeat())) {
                    throw new ExceptionWrongSeat("Asiento incorrecto!");
                } else {
                    System.out.println("Asiento correcto.");
                    validation = true;
                }
            } catch (ExceptionWrongSeat error) {
                System.out.println(error.getMessage());
            }
        }
        return seat;
    }

    public String insertName() {
        boolean validation = false;
        String name;
        do {
            System.out.println("Inserta el NOMBRE: ");
            name = sc.nextLine();
            try {

                for (int i = 0; i < name.length(); i++) {
                    if (Character.isDigit(name.charAt(i))) {
                        throw new ExceptionWrongName("Nombre equivocado!");
                    }
                }
                validation = true;
                System.out.println("Nombre correcto");

            } catch (ExceptionWrongName error) {
                System.out.println(error.getMessage());
            }
        } while (!validation);
        return name;
    }


    public void showReservationsClient(String name) {
        boolean found = false;
        for (Seat seat : cineNew.getSeatManager().getListSeat()) {
            if (seat.getName().equalsIgnoreCase(name)) {
                System.out.println(seat.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No hay reservas con este nombre");
        }
    }

    public void eliminateReservation() {
        int row = insertRow();
        int seat = insertSeat();
        cineNew.getSeatManager().deleteSeat(row, seat);
    }


    public void eliminateAllReservation() {
        String name = insertName();
        cineNew.getSeatManager().deleteAllSeat(name);
    }

}


