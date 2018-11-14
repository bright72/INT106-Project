/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLR.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "ORDERDETAIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderdetail.findAll", query = "SELECT o FROM Orderdetail o")
    , @NamedQuery(name = "Orderdetail.findByOrderdetailid", query = "SELECT o FROM Orderdetail o WHERE o.orderdetailid = :orderdetailid")
    , @NamedQuery(name = "Orderdetail.findByQuantity", query = "SELECT o FROM Orderdetail o WHERE o.quantity = :quantity")
    , @NamedQuery(name = "Orderdetail.findByPriceeach", query = "SELECT o FROM Orderdetail o WHERE o.priceeach = :priceeach")})
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDERDETAILID")
    private Integer orderdetailid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUANTITY")
    private int quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRICEEACH")
    private BigDecimal priceeach;
    @JoinColumn(name = "ORDERID", referencedColumnName = "ORDERID")
    @ManyToOne(optional = false)
    private Orders orderid;
    @JoinColumn(name = "PRODUCTCODE", referencedColumnName = "PRODUCTCODE")
    @ManyToOne(optional = false)
    private Product productcode;

    public Orderdetail() {
    }

    public Orderdetail(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public Orderdetail(Integer orderdetailid, int quantity, BigDecimal priceeach) {
        this.orderdetailid = orderdetailid;
        this.quantity = quantity;
        this.priceeach = priceeach;
    }

    public Integer getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPriceeach() {
        return priceeach;
    }

    public void setPriceeach(BigDecimal priceeach) {
        this.priceeach = priceeach;
    }

    public Orders getOrderid() {
        return orderid;
    }

    public void setOrderid(Orders orderid) {
        this.orderid = orderid;
    }

    public Product getProductcode() {
        return productcode;
    }

    public void setProductcode(Product productcode) {
        this.productcode = productcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderdetailid != null ? orderdetailid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdetail)) {
            return false;
        }
        Orderdetail other = (Orderdetail) object;
        if ((this.orderdetailid == null && other.orderdetailid != null) || (this.orderdetailid != null && !this.orderdetailid.equals(other.orderdetailid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FLR.model.Orderdetail[ orderdetailid=" + orderdetailid + " ]";
    }
    
}
