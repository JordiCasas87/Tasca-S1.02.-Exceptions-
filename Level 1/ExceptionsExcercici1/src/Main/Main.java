package Main;

import exceptions.EmptySaleException;
import model.Product;
import model.Sale;

public class Main {
    public static void main(String[] args) {

        Product fruit = new Product("Pineaple", 5);
        Product fruit1 = new Product("Melon", 4);



        Sale sale1 = new Sale();

        try {
            int emptyTotal = sale1.calculateTotal();
        }catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        sale1.setProductList(fruit);
        sale1.setProductList(fruit1);


        try {
            int total = sale1.calculateTotal();
            System.out.println("El total de la venta es: " + total + "€");

        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        Product fruit2 = new Product("Apple", 3);
        sale1.setProductList(fruit2);

        try {
            int total = sale1.calculateTotal();
            System.out.println("El total de la venta es: " + total + "€");


        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }
}