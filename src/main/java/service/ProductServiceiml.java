package service;

import model.Products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductServiceiml implements ProductService{
    private static ArrayList< Products> products;
    static {
        products = new ArrayList<>();
        products.add(1, new Products(1,"John", "john@codegym.vn", "Hanoi"));
        products.add(2, new Products(2, "Bill", "bill@codegym.vn", "Danang"));
        products.add(3, new Products(3, "Alex", "alex@codegym.vn", "Saigon"));
        products.add(4, new Products(4, "Adam", "adam@codegym.vn", "Beijin"));
        products.add(5, new Products(5, "Sophia", "sophia@codegym.vn", "Miami"));
        products.add(6, new Products(6, "Rose", "rose@codegym.vn", "Newyork"));
    }



    @Override
    public List<Products> findAll() {
        return null;
    }

    @Override
    public void save(Products products) {

    }

    @Override
    public Products findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Products products) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void edit(int index, Products p) {

    }


}
