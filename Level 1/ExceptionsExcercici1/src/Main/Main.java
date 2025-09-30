package Main;

import java.util.ArrayList;
import model.Product;
import model.Sale;

public class Main {
    public static void main(String[] args) {

        Product fruit = new Product("Pineaple", 5);
        Product fruit1 = new Product("Melon", 4);

        Sale sale1 = new Sale();
        sale1.setProductList(fruit);
        sale1.setProductList(fruit1);

        //ArrayList<Product> listSale = sale1.getProductList();
        int total = sale1.calculateTotal();
        if (total != -1) {
            System.out.println("El total de la venta es: " + total + "€");
        }

        // Check that the total is added correctly.s.
        Product fruit2 = new Product("Apple", 3);
        sale1.setProductList(fruit2);

        total = sale1.calculateTotal();
        if (total != -1) {
            System.out.println("El total de la venta es: " + total + "€");

        }
    }
}