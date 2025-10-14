package main;

import model.Cine;
import model.Seat;

import java.util.ArrayList;

public class ManagementMain {
    public static void main(String[] args) {

        Cine cine1 = new Cine();
        start(cine1);

    }

    static public void start(Cine cine1) {

        int option;
        do {
            option = cine1.getCineManager().menu();

            switch (option) {
                case 0:
                    System.out.println("Adios, gracias por usar el sistema de reservas.");
                    break;

                case 1:
                    ArrayList<Seat> listDef = cine1.getSeatManager().getListSeat();
                    if (listDef != null) {
                        for (Seat seat : listDef) {
                            System.out.println(seat.toString());
                        }
                    }
                    break;

                case 2:
                    String name = cine1.getCineManager().insertName();
                    cine1.getCineManager().showReservationsClient(name);
                    break;

                case 3:
                    cine1.getCineManager().reservationSeat();
                    break;

                case 4:
                    cine1.getCineManager().eliminateReservation();
                    break;

                case 5:
                    cine1.getCineManager().eliminateAllReservation();
                    break;

                default:
                    System.out.println("Opción incorrecta\n");

            }

        } while (option != 0);
    }

}
