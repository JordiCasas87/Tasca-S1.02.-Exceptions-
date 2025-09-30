package main;

import model.Cine;
import model.ManageCine;
import model.Seat;

public class ManagementMain {
    public static void main(String[] args) {

        //check de equals con mensaje
        Seat newSeat = new Seat(10, 23, "Maria");
        Seat newSeat1 = new Seat(10, 23, "Pepe");
        newSeat.equals(newSeat1);
        //check to string
        System.out.println(newSeat1.toString());

        Cine cine1 = new Cine();

        cine1.iniciar();



    }
}
