package model;

import exceptions.ExceptionBoolean;
import exceptions.ExceptionChar;
import exceptions.ExceptionString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {

    static Scanner sc = new Scanner(System.in);
    public static byte readByte(String message) {
        byte age = 0;
        boolean validation = false;

        while (!validation) {
            try {
                System.out.println(message);
                age = sc.nextByte();
                validation = true;
            } catch (InputMismatchException e) {
                System.out.println("Edad incorrecta!");
                sc.nextLine();
            }
        }
        return age;
    }

    public static int readInt(String message){
        int numDni =0 ;
        boolean validation = false;
        while (!validation) {
            try {
                System.out.println(message);
                numDni = sc.nextInt();
                validation = true;
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto de DNI!");
                sc.nextLine();
            }
        }
        return numDni;
    }

    public static float readFloat(String message){
        float height  =0f ;
        boolean validation = false;
        while (!validation) {
            try {
                System.out.println(message);
                height = sc.nextFloat();
                validation = true;
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto de altura");
                sc.nextLine();
            }
        }
        return height;
    }

    public static double readDouble(String message){
        double weight =0 ;
        boolean validation = false;
        while (!validation) {
            try {
                System.out.println(message);
                weight = sc.nextDouble();
                validation = true;
            } catch (InputMismatchException e) {
                System.out.println("Formato incorrecto de peso");
                sc.nextLine();
            }
        }
        return weight;
    }

    public static char readChar(String message){
        char dniLetter=' ';
        boolean validation = false;
        while (!validation) {
            try {
                System.out.println(message);
                dniLetter = sc.next().charAt(0);
                sc.nextLine();

                if ((dniLetter != 'A'&& dniLetter !='a' )&&
                        (dniLetter != 'B'&& dniLetter !='b' )&&
                        (dniLetter != 'C' && dniLetter !='c')){
                    throw new ExceptionChar("Letra incorrecta:");
                }
                validation = true;
            } catch (ExceptionChar e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        return dniLetter;

    }

    public static String readString (String message){
        String destination ="";
        boolean validation = false;
        while (!validation) {
            try {
                System.out.println(message);
                destination = sc.nextLine();

                if (!destination.equalsIgnoreCase("playa")&&
                        (!destination.equalsIgnoreCase("montaña"))){
                    throw new ExceptionString("Palabra incorrecta.");
                }
                validation = true;
            } catch (ExceptionString e) {
                System.out.println(e.getMessage());
            }
        }
        return destination;

    }

    public static boolean readYesNo (String message){
        boolean decition= false;
        char answer =' ';
        do {
            try {
                System.out.println(message);
                answer= sc.next().charAt(0);

                if ((answer !='s')&&(answer!='n')){
                    throw new ExceptionBoolean("Error en la eleccion (si/no)");
                }
                decition = true;
            } catch (ExceptionBoolean e) {
                System.out.println(e.getMessage());
            }

        } while (!decition);

        if (answer=='s'){
            decition=true;
        }else if (answer=='n'){
            decition=false;
        }
        return decition;

    }

}


