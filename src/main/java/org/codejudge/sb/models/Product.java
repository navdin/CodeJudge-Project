package org.codejudge.sb.models;

import com.fasterxml.jackson.annotation.JsonTypeId;

//@Entity
public class Product {


    public Product() {
    }

    public Product(int id, String name, String category, String description, String buy_price, String sell_price,
                   String quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
        this.quantity = quantity;
    }

    //    @Id
//    @Generated(strategy=GenerationType.Auto)
    private int id;
    private String name;
    private String category;
    private String description;
    private String buy_price;
    private String sell_price;
    private String quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(String buy_price) {
        this.buy_price = buy_price;
    }

    public String getSell_price() {
        return sell_price;
    }

    public void setSell_price(String sell_price) {
        this.sell_price = sell_price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
