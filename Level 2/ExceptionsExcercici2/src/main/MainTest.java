package main;

import model.Entry;

public class MainTest {

    public static void main(String[] args) {

        byte age = Entry.readByte("Introduce tu edad: ");
        int dni = Entry.readInt("Introduce los numeros de tu Dni: ");
        float height = Entry.readFloat("Introduce tu altura: ");
        double weight = Entry.readDouble("Introduce tu peso: ");
        char dniLetter = Entry.readChar("Introduce una de estas letras para tu Dni (A - B - C): ");
        String destination = Entry.readString("Introduce tu preferencia, playa o montaña? : ");
        boolean decition = Entry.readYesNo("Tienes pasaporte en regla? : ");

        System.out.println();
        System.out.println("La edad introducida es: " + age);
        System.out.println("El Dni introducido es: " + dni);
        System.out.println("La altura introducida es: " + height);
        System.out.println("El peso introducido es: " + weight);
        System.out.println("La letra introducida es: " + dniLetter);
        System.out.println("Tu preferencia es:  " + destination);
        System.out.println("Pasaporte vigente: " + decition);

    }
}
