package ticketsystem.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Songs {
    private String songsid;
    private String kindid;
    private String showname;
    private String price;
    private String imgsrc;
    private String showarea;
    private String introduce;
    private String showtime;

    @Id
    @Column(name = "songsid")
    public String getSongsid() {
        return songsid;
    }

    public void setSongsid(String songsid) {
        this.songsid = songsid;
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

        Songs songs = (Songs) o;

        if (songsid != null ? !songsid.equals(songs.songsid) : songs.songsid != null) return false;
        if (kindid != null ? !kindid.equals(songs.kindid) : songs.kindid != null) return false;
        if (showname != null ? !showname.equals(songs.showname) : songs.showname != null) return false;
        if (price != null ? !price.equals(songs.price) : songs.price != null) return false;
        if (imgsrc != null ? !imgsrc.equals(songs.imgsrc) : songs.imgsrc != null) return false;
        if (showarea != null ? !showarea.equals(songs.showarea) : songs.showarea != null) return false;
        if (introduce != null ? !introduce.equals(songs.introduce) : songs.introduce != null) return false;
        if (showtime != null ? !showtime.equals(songs.showtime) : songs.showtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = songsid != null ? songsid.hashCode() : 0;
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
