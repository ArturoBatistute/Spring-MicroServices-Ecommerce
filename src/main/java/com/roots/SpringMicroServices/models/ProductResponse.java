package com.roots.SpringMicroServices.models;

import java.util.List;

public class ProductResponse {

    private List<Product> products;

    public ProductResponse() {

    }

    public ProductResponse(List<Product> products) {

        this.products = products;
    }

    public List<Product> getProducts() {

        return products;
    }

    public void setProducts(List<Product> products) {

        this.products = products;
    }
}
