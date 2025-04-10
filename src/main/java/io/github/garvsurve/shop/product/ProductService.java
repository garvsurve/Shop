package io.github.garvsurve.shop.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productsList;

    public ProductService() {
        productsList = new LinkedList<>();
    }

    //CRUD- create reade update delete
        //Create
        public Product AddProduct(Product product){
            productsList.add(product);
            return product;
        }
        //Read

        //Update
        //Delete

}
