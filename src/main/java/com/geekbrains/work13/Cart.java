package com.geekbrains.work13;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Component
public class Cart {

    private List <Product> cart;

    @PostConstruct
    void initCart() {
        cart = new ArrayList<>();
    }

    public void add(Product product) {
        cart.add(product);
        System.out.println("\n" + product.getTitle() + " добавленно в корзину");
    }

    public List<Product> getProducts() {
        return cart;
    }
}


