package ticketsystem.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Goodtype {
    private String gtid;
    private String gtname;
    private Byte state;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "gtid")
    public String getGtid() {
        return gtid;
    }

    public void setGtid(String gtid) {
        this.gtid = gtid;
    }

    @Basic
    @Column(name = "gtname")
    public String getGtname() {
        return gtname;
    }

    public void setGtname(String gtname) {
        this.gtname = gtname;
    }

    @Basic
    @Column(name = "state")
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goodtype goodtype = (Goodtype) o;

        if (gtid != null ? !gtid.equals(goodtype.gtid) : goodtype.gtid != null) return false;
        if (gtname != null ? !gtname.equals(goodtype.gtname) : goodtype.gtname != null) return false;
        if (state != null ? !state.equals(goodtype.state) : goodtype.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gtid != null ? gtid.hashCode() : 0;
        result = 31 * result + (gtname != null ? gtname.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
