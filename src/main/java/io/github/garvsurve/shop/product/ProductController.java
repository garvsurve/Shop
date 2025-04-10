package io.github.garvsurve.shop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//REST- REpresentational state transfer
//JASON-Javascript object notation


@RestController
public class ProductController {
    private ProductService productService;


@Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //CREATE-POST
    @PostMapping("/product/add")
    public Product AddProduct(@RequestBody Product product){
        productService.AddProduct(product);
        return product;
    }
    //READ-GET


    //UPDATE-PUT


    //DELETE-DELETE


    // REQUEST - HTTP METHOD & URL
    //RESPONSE - HTTP STATUS & RESPONSE BODY

}
