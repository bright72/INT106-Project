/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author INT303
 */
@Embeddable
public class OrderdetailPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDERID")
    private int orderid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTCODE")
    private int productcode;

    public OrderdetailPK() {
    }

    public OrderdetailPK(int orderid, int productcode) {
        this.orderid = orderid;
        this.productcode = productcode;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) orderid;
        hash += (int) productcode;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderdetailPK)) {
            return false;
        }
        OrderdetailPK other = (OrderdetailPK) object;
        if (this.orderid != other.orderid) {
            return false;
        }
        if (this.productcode != other.productcode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.OrderdetailPK[ orderid=" + orderid + ", productcode=" + productcode + " ]";
    }
    
}
