package org.codejudge.sb.models;

import com.fasterxml.jackson.annotation.JsonTypeId;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;

//import javax.persistence.EntityListeners;

//@Entity
//@EntityListeners(AuditingEntityListener.class)
public class Product {


    public Product() {
    }

    public Product(int id, String name, String category, String description, String buy_price, String sell_price,
                   Integer quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
        this.quantity = quantity;
    }

    //    @Id
//    @GeneratedValue(strategy=GenerationType.Auto)
    private int id;
    private String name;
    private String category;
    private String description;
    private String buy_price;
    private String sell_price;
    private Integer quantity;

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
