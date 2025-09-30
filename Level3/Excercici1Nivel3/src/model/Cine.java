package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {

    static Scanner sc = new Scanner(System.in);

    private int totalRow;
    private int totalSeat;
    private ManageSeat seatManager;
    private ManageCine cineManager;


    public Cine() {
        this.seatManager = new ManageSeat();
        this.cineManager = new ManageCine(this); //el propio cine que crea.
        requestData();
    }


    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public ManageSeat getSeatManager() {
        return seatManager;
    }

    public void setSeatManager(ManageSeat seatManager) {
        this.seatManager = seatManager;
    }

    public ManageCine getCineManager() {
        return cineManager;
    }

    public void setCineManager(ManageCine cineManager) {
        this.cineManager = cineManager;
    }

    public void requestData() {
        System.out.println("Introduce numero de filas del cine: ");
        int totalRows = sc.nextInt();
        sc.nextLine();
        this.totalRow = totalRows;

        System.out.println("Introduce numero de asientos por fila del cine: ");
        int totalSeats = sc.nextInt();
        sc.nextLine();
        this.totalSeat = totalSeats;
    }

    public void start() {

        int option;
        do {
            option = cineManager.menu();

            switch (option) {
                case 0:
                    System.out.println("Adios, gracias por usar el sistema de reservas.");
                    break;

                case 1:
                    ArrayList<Seat> listDef = cineManager.getListSeats();
                    if (listDef != null) {
                        for (Seat seat : listDef) {
                            System.out.println(seat.toString());
                        }
                    }
                    break;

                case 2:
                    String name = cineManager.insertName();
                    cineManager.showReservationsClient(name);
                    break;

                case 3:
                    cineManager.reservationSeat();
                    break;

                case 4:
                    cineManager.eliminateReservation();
                    break;

                case 5:
                    cineManager.eliminateAllReservation();
                    break;

                default:
                    System.out.println("Opción incorrecta\n");

            }

        } while (option != 0);
    }

}





