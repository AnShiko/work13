package com.geekbrains.work13;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductService implements AllServices {

    private List <Product> productList;

    @PostConstruct
    private void initProductList() {
        productList = Arrays.asList(
                new Product("Сушки", 80),
                new Product("Масло", 50),
                new Product("Мясо", 350),
                new Product("Макароны", 60),
                new Product("Конфеты", 100),
                new Product("Сушки", 80),
                new Product("Редис", 30),
                new Product("Сыр", 250),
                new Product("Молоко", 55),
                new Product("Багет", 29)
        );
    }

    @Override
    public void printAll() {
        System.out.println();
        for (Product product : productList) {
            System.out.println("Из следующего списка товаров " + product);

        }

    }

    @Override
    public Product findByTitle(String title) {
        return productList.get(productList.indexOf(new Product(" ", 0)));
    }
}
