package org.codejudge.sb.models;

public class DataProduct {


    public DataProduct() {
    }

    private Product data;


    public DataProduct(Product data) {
        this.data = data;
    }

    public Product getData() {
        return data;
    }

    public void setData(Product data) {
        this.data = data;
    }
}
