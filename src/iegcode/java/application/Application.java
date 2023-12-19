package iegcode.java.application;


import iegcode.java.data.*;
import iegcode.java.data.Product;

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Macbook M2 Pro ",  30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }

    Data data = new Data();
}






// update