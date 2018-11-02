/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author INT303
 */
@Entity
@Table(name = "ACCOUNT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")
    , @NamedQuery(name = "Account.findByCustomerid", query = "SELECT a FROM Account a WHERE a.customerid = :customerid")
    , @NamedQuery(name = "Account.findByEncryptedpassword", query = "SELECT a FROM Account a WHERE a.encryptedpassword = :encryptedpassword")
    , @NamedQuery(name = "Account.findByFname", query = "SELECT a FROM Account a WHERE a.fname = :fname")
    , @NamedQuery(name = "Account.findByLname", query = "SELECT a FROM Account a WHERE a.lname = :lname")
    , @NamedQuery(name = "Account.findByAddress", query = "SELECT a FROM Account a WHERE a.address = :address")
    , @NamedQuery(name = "Account.findByProvince", query = "SELECT a FROM Account a WHERE a.province = :province")
    , @NamedQuery(name = "Account.findByCountry", query = "SELECT a FROM Account a WHERE a.country = :country")
    , @NamedQuery(name = "Account.findByPostalcode", query = "SELECT a FROM Account a WHERE a.postalcode = :postalcode")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMERID")
    private Integer customerid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ENCRYPTEDPASSWORD")
    private String encryptedpassword;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LNAME")
    private String lname;
    @Size(max = 100)
    @Column(name = "ADDRESS")
    private String address;
    @Size(max = 20)
    @Column(name = "PROVINCE")
    private String province;
    @Size(max = 20)
    @Column(name = "COUNTRY")
    private String country;
    @Size(max = 10)
    @Column(name = "POSTALCODE")
    private String postalcode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerid")
    private List<Orders> ordersList;

    public Account() {
    }

    public Account(Integer customerid) {
        this.customerid = customerid;
    }

    public Account(Integer customerid, String encryptedpassword, String fname, String lname) {
        this.customerid = customerid;
        this.encryptedpassword = encryptedpassword;
        this.fname = fname;
        this.lname = lname;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getEncryptedpassword() {
        return encryptedpassword;
    }

    public void setEncryptedpassword(String encryptedpassword) {
        this.encryptedpassword = encryptedpassword;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    @XmlTransient
    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerid != null ? customerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.customerid == null && other.customerid != null) || (this.customerid != null && !this.customerid.equals(other.customerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Account[ customerid=" + customerid + " ]";
    }
    
}
