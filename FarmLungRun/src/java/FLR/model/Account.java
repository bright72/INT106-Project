/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLR.model;

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
 * @author SARUNSUMETPANICH
 */
@Entity
@Table(name = "ACCOUNT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")
    , @NamedQuery(name = "Account.findByUsername", query = "SELECT a FROM Account a WHERE a.username = :username")
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
    @Size(min = 1, max = 20)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private List<Orders> ordersList;

    public Account() {
    }

    public Account(String username) {
        this.username = username;
    }

    public Account(String username, String encryptedpassword, String fname, String lname) {
        this.username = username;
        this.encryptedpassword = encryptedpassword;
        this.fname = fname;
        this.lname = lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FLR.model.Account[ username=" + username + " ]";
    }
    
}
