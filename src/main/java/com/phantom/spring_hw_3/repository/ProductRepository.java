package com.phantom.spring_hw_3.repository;

import com.phantom.spring_hw_3.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> productList = new ArrayList<>();
    @PostConstruct
    public void init(){
        productList.add(new Product(1l,"Banana",99));
        productList.add(new Product(2l,"Oil",399));
        productList.add(new Product(3l,"Potatoes",79));
        productList.add(new Product(4l,"Apple",129));
        productList.add(new Product(5l,"Milk",99));
        productList.add(new Product(6l,"Bread",59));
        productList.add(new Product(7l,"Sugar",89));

    }

}
