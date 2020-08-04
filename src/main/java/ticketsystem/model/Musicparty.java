package ticketsystem.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Musicparty {
    private String musicpartyid;
    private String kindid;
    private String showname;
    private String price;
    private String imgsrc;
    private String showarea;
    private String introduce;
    private String showtime;

    @Id
    @Column(name = "musicpartyid")
    public String getMusicpartyid() {
        return musicpartyid;
    }

    public void setMusicpartyid(String musicpartyid) {
        this.musicpartyid = musicpartyid;
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

        Musicparty that = (Musicparty) o;

        if (musicpartyid != null ? !musicpartyid.equals(that.musicpartyid) : that.musicpartyid != null) return false;
        if (kindid != null ? !kindid.equals(that.kindid) : that.kindid != null) return false;
        if (showname != null ? !showname.equals(that.showname) : that.showname != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (imgsrc != null ? !imgsrc.equals(that.imgsrc) : that.imgsrc != null) return false;
        if (showarea != null ? !showarea.equals(that.showarea) : that.showarea != null) return false;
        if (introduce != null ? !introduce.equals(that.introduce) : that.introduce != null) return false;
        if (showtime != null ? !showtime.equals(that.showtime) : that.showtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = musicpartyid != null ? musicpartyid.hashCode() : 0;
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
