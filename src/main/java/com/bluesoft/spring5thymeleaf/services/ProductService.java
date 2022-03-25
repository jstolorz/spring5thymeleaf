package com.bluesoft.spring5thymeleaf.services;

import com.bluesoft.spring5thymeleaf.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();

}
