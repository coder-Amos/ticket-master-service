package ticketsystem.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Shop {
    private String id;
    private String userid;
    private BigDecimal price;
    private Timestamp shopdate;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userid")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "shopdate")
    public Timestamp getShopdate() {
        return shopdate;
    }

    public void setShopdate(Timestamp shopdate) {
        this.shopdate = shopdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        if (id != null ? !id.equals(shop.id) : shop.id != null) return false;
        if (userid != null ? !userid.equals(shop.userid) : shop.userid != null) return false;
        if (price != null ? !price.equals(shop.price) : shop.price != null) return false;
        if (shopdate != null ? !shopdate.equals(shop.shopdate) : shop.shopdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (shopdate != null ? shopdate.hashCode() : 0);
        return result;
    }
}
