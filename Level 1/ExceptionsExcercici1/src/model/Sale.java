package model;

import java.util.ArrayList;
import model.EmptySaleException;


public class Sale {

    private ArrayList<Product> productList;
    private int total;

    public Sale() {
        this.productList = new ArrayList<Product>() ;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(Product product) {
        productList.add(product);
    }

    public int calculateTotal() {
        total = 0;
        try {
            if (productList.isEmpty()) {
                throw new EmptySaleException("Error! Per fer una venda primer has d’afegir productes!");

            } else {

                for (Product product : productList) {
                    total += product.getPrice();
                }
            }

        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
            return -1;
        }
        return total;
    }

    }

