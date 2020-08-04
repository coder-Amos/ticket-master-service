package ticketsystem.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Opera {
    private String operaid;
    private String kindid;
    private String showname;
    private String price;
    private String imgsrc;
    private String showarea;
    private String introduce;
    private String showtime;

    @Id
    @Column(name = "operaid")
    public String getOperaid() {
        return operaid;
    }

    public void setOperaid(String operaid) {
        this.operaid = operaid;
    }

    @Basic
    @Column(name = "kindid")
    public String getKindid() {
        return kindid;
    }

    public void setKindid(String kindid) {
        this.kindid = kindid;
    }

    @Basic
    @Column(name = "showname")
    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "imgsrc")
    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    @Basic
    @Column(name = "showarea")
    public String getShowarea() {
        return showarea;
    }

    public void setShowarea(String showarea) {
        this.showarea = showarea;
    }

    @Basic
    @Column(name = "introduce")
    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Basic
    @Column(name = "showtime")
    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Opera opera = (Opera) o;

        if (operaid != null ? !operaid.equals(opera.operaid) : opera.operaid != null) return false;
        if (kindid != null ? !kindid.equals(opera.kindid) : opera.kindid != null) return false;
        if (showname != null ? !showname.equals(opera.showname) : opera.showname != null) return false;
        if (price != null ? !price.equals(opera.price) : opera.price != null) return false;
        if (imgsrc != null ? !imgsrc.equals(opera.imgsrc) : opera.imgsrc != null) return false;
        if (showarea != null ? !showarea.equals(opera.showarea) : opera.showarea != null) return false;
        if (introduce != null ? !introduce.equals(opera.introduce) : opera.introduce != null) return false;
        if (showtime != null ? !showtime.equals(opera.showtime) : opera.showtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operaid != null ? operaid.hashCode() : 0;
        result = 31 * result + (kindid != null ? kindid.hashCode() : 0);
        result = 31 * result + (showname != null ? showname.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (imgsrc != null ? imgsrc.hashCode() : 0);
        result = 31 * result + (showarea != null ? showarea.hashCode() : 0);
        result = 31 * result + (introduce != null ? introduce.hashCode() : 0);
        result = 31 * result + (showtime != null ? showtime.hashCode() : 0);
        return result;
    }
}
