package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
static Scanner sc = new Scanner(System.in);
    /*
    Classe Cine ontindrà els atributs i el mètode d’inicialització.

Atributs:
Nombre de files del cinema.
Nombre de seients per cada fila.
Un objecte de la classe "GestioButaques"
Un objecte de la classe "GestioCine"
Mètodes:

Constructor: no rebrà paràmetres. Inicialitzarà l’objecte de la classe "GestioButaques" i "GestioCine".
Cridarà al mètode "demanarDadesInicials" que inicialitzarà el nombre de files i de seients.

iniciar: començarà l’aplicació. Cridarà al mètode "menu" i en funció del número retornat,
cridarà al mètode corresponent de la classe "GestioCine".

"demanarDadesInicials": Demanarà a l’usuari/ària el nombre de files i seients
i els guardarà en els atributs corresponents
     */

    private int totalRow;
    private int totalSeat;
    private ManageSeat nameManageSeat;       // crear clase y comprobar
    private ManageCine nameManageCine;        // crear clase y comprobar


    public Cine() {
        this.nameManageSeat = new ManageSeat();
        this.nameManageCine = new ManageCine (this); //el propio cine que crea.

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

    public ManageSeat getNameManageSeat() {
        return nameManageSeat;
    }

    public void setNameManageSeat(ManageSeat nameManageSeat) {
        this.nameManageSeat = nameManageSeat;
    }

    public ManageCine getNameManageCine() {
        return nameManageCine;
    }

    public void setNameManageCine(ManageCine nameManageCine) {
        this.nameManageCine = nameManageCine;
    }

    public void requestData (){
        System.out.println("Introduce numero de filas del cine: ");
        int totalRows = sc.nextInt();
        sc.nextLine();
        this.totalRow = totalRows;

        System.out.println("Introduce numero de asientos por fila del cine: ");
        int totalSeats =sc.nextInt();
        sc.nextLine();
        this.totalSeat = totalSeats;
    }

    public void iniciar(){
        // llamar a metodo menu() que estará en ManageCine.
        int option;
        do {
            option = nameManageCine.menu();
            
            switch (option) {
                case 0:
                    System.out.println("Adios, gracias por usar el sistema de reservas.");
                    break;
                case 1:
                    ArrayList<Seat> listDef = nameManageCine.getListSeats();
                    if (listDef != null) {
                        for (Seat seat : listDef) {
                            System.out.println(seat.toString());
                        }
                    }

                    break;
                case 2:
                    String name = nameManageCine.insertName();
                   nameManageCine.reservationsClient(name);
                    break;
                case 3:
                    nameManageCine.reservationSeat();
                    break;
                case 4:
                    nameManageCine.eliminateReservation();
                    break;
                case 5:
                    nameManageCine.eliminateAllReservation();
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
            System.out.println();
        }while (option !=0);
    }

}





