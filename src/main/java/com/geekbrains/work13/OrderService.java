package com.geekbrains.work13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService implements AllServices {
    private Cart cart;

    @Autowired
    public void setCart(Cart cart) {
        this.cart = cart;
    }


    public void makeOrder() {
        double totalCost = 0;

        System.out.println("\nВ корзину положили:");
        for (Product product : cart.getProducts()) {
            System.out.println(product);
            totalCost += product.getPrice();
        }
        System.out.println("итоговая стоимость покупки: " + totalCost);
    }

    @Override
    public void printAll() {

    }

    @Override
    public Product findByTitle(String title) {
        return null;
    }
}