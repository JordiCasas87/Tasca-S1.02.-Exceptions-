package model;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
        boolean validation = false;
        while (!validation) {
            try {

                System.out.println("Introduce numero de filas del cine: ");
                int totalRows = sc.nextInt();

                if (totalRows <= 0) {
                    throw new ExceptionWrongRow("Error, numero de debe ser mayor de 0");
                } else {
                    this.totalRow = totalRows;
                    validation = true;
                }

            } catch (ExceptionWrongRow e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        validation = false;

        while (!validation) {

            try {

                System.out.println("Introduce numero de asientos por fila del cine: ");
                int totalSeats = sc.nextInt();

                if (totalSeats <= 0) {
                    throw new ExceptionWrongSeat("Error, numero de debe ser mayor de 0");
                } else {
                    this.totalSeat = totalSeats;
                    validation = true;
                }

            } catch (ExceptionWrongSeat e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error, debe ser un numero");
                System.out.println(e.getMessage());
            }
        }

    }
}




