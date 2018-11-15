/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLR.model;

import java.math.BigDecimal;

/**
 *
 * @author Dell
 */
public class LineItem {

    private Product product;
    private int quantity;
    private BigDecimal price;

    public LineItem() {
    }
    
    public LineItem(Product product) {
        this(product,1);
    }

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = product.getProductprice();
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public double getTotalPrice(){
        double eachPrice = this.price.doubleValue();
        double totalPrice = this.quantity * eachPrice;
        return totalPrice;
    }
    
}
