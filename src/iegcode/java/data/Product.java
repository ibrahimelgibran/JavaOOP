package iegcode.java.data;

import java.util.Objects;

public class Product {
    public String name; // protected cuma bisa diakses diketurunannya dan di packege yang sama
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product name : " + name + ", Price " + price;
    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }
}

