package model;

import java.util.ArrayList;
import exceptions.EmptySaleException;


public class Sale {

    private ArrayList<Product> productList;
    private int total;

    public Sale() {
        this.productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(Product product) {
        productList.add(product);
    }

    public int calculateTotal() throws EmptySaleException {
        total = 0;

        if (productList.isEmpty()) {
            throw new EmptySaleException("Error! Per fer una venda primer has d’afegir productes!");
        }

        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }

    }








