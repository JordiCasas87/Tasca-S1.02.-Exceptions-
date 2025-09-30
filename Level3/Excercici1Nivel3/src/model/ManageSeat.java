package model;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageSeat {

    private ArrayList<Seat> listSeat;

    public ManageSeat() {
        this.listSeat = new ArrayList<>();
    }

    //mostrar lista
    public ArrayList<Seat> getListSeat() {
        if (listSeat.isEmpty()) {
            System.out.println("No hay reservas!");
            return null;
        }
        return listSeat;
    }

//añadir
    /*
    "afegirButaca": serà l’encarregat d’afegir una butaca a l’ArrayList de butaques.
    Rebrà com a paràmetre un objecte de la classe "Butaca" i l’afegirà a l’ArrayList.
    Si la fila i el seient de la butaca rebuda com a paràmetre coincideixen amb el d’una butaca que ja es trobi a l’ArrayList
    (s’utilitzarà el mètode "cercarButaca"), es llençarà l’excepció personalitzada "ExcepcioButacaOcupada".
     */

    public void addSeat(Seat seat) {
        int findSeat = findOcupedSeat(seat.getRowNumber(),seat.getSeatNumber());
        try {

            if (findSeat == -1) {
                listSeat.add(seat);
                System.out.println("Asiento añadido correctamente!");
            } else {
                throw new ExceptionSeatOccupied ("Asiento ya reservado.");
            }
        }catch(ExceptionSeatOccupied error){
            System.out.println(error.getMessage());
        }
    }

    //buscar para añadir.
    /*"cercarButaca": Cerca a l’ArrayList de butaques, la butaca que coincideixi amb les dades rebudes com a paràmetre (fila i seient).
     Si la troba, retornarà la posició de la butaca a l’ArrayList i, si no la troba, retornarà -1.
     */

    public int findOcupedSeat(int row, int seat) {

        for (int i=0; i< listSeat.size();i++){
            if (((listSeat.get(i).getRowNumber()==row)
                    &&((listSeat.get(i).getSeatNumber()==seat)))) {
                return i;
            }
        }
        return -1;
    }

    /*
    "eliminarButaca": serà l’encarregat d’eliminar una butaca de l’ArrayList de butaques.
    Rebrà com a paràmetres el número de fila i el seient i l’eliminarà de l’ArrayList.
     Si la fila i el seient no coincideixen amb el d’una butaca reservada (s’utilitzarà el mètode "cercarButaca"),
      llençarà una excepció personalitzada "ExcepcioButacaLliure".
*/

    public void deleteSeat (int row, int seat) {
        try {
            int findSeat = findOcupedSeat(row, seat);
            if (findSeat != -1) {
                listSeat.remove(findSeat);
                System.out.println("Reserva eliminada!");
            } else {
                throw new SeatFreeException("Estas butacas no estan reservadas!");
                //codigo de try catch con su excepcion.
            }
        } catch (SeatFreeException error) {
            System.out.println(error.getMessage());
        }

    }
        //borrar todas las reservas de un nombre

        public void deleteAllSeat ( String name){
            for (int i= listSeat.size()-1; i>=0 ; i--){
                if (((listSeat.get(i).getName().equalsIgnoreCase(name)))){
                    listSeat.remove(i);
                }
            }
            System.out.println("Reservas de "+name+ " eliminadas.");
        }


    }