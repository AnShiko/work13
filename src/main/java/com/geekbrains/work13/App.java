package com.geekbrains.work13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = context.getBean("cart", Cart.class);
        ProductService productService = context.getBean("ProductService", ProductService.class);
        OrderService orderService = context.getBean("OrderService", OrderService.class);
        productService.printAll();

        cart.add(productService.findByTitle("Конфеты"));
        cart.add(productService.findByTitle("Мясо"));
        cart.add(productService.findByTitle("Редис"));



        orderService.makeOrder();
    }
}
