package ticketsystem.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Ticket {
    private String ticketid;
    private String ticketuser;
    private String tickettime;
    private String ticketarea;
    private String ticketname;
    private String ticketprice;
    private String taketime;
    private String ticketimgsrc;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "ticketid")
    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }

    @Basic
    @Column(name = "ticketuser")
    public String getTicketuser() {
        return ticketuser;
    }

    public void setTicketuser(String ticketuser) {
        this.ticketuser = ticketuser;
    }

    @Basic
    @Column(name = "tickettime")
    public String getTickettime() {
        return tickettime;
    }

    public void setTickettime(String tickettime) {
        this.tickettime = tickettime;
    }

    @Basic
    @Column(name = "ticketarea")
    public String getTicketarea() {
        return ticketarea;
    }

    public void setTicketarea(String ticketarea) {
        this.ticketarea = ticketarea;
    }

    @Basic
    @Column(name = "ticketname")
    public String getTicketname() {
        return ticketname;
    }

    public void setTicketname(String ticketname) {
        this.ticketname = ticketname;
    }

    @Basic
    @Column(name = "ticketprice")
    public String getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(String ticketprice) {
        this.ticketprice = ticketprice;
    }

    @Basic
    @Column(name = "taketime")
    public String getTaketime() {
        return taketime;
    }

    public void setTaketime(String taketime) {
        this.taketime = taketime;
    }

    @Basic
    @Column(name = "ticketimgsrc")
    public String getTicketimgsrc() {
        return ticketimgsrc;
    }

    public void setTicketimgsrc(String ticketimgsrc) {
        this.ticketimgsrc = ticketimgsrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (ticketid != null ? !ticketid.equals(ticket.ticketid) : ticket.ticketid != null) return false;
        if (ticketuser != null ? !ticketuser.equals(ticket.ticketuser) : ticket.ticketuser != null) return false;
        if (tickettime != null ? !tickettime.equals(ticket.tickettime) : ticket.tickettime != null) return false;
        if (ticketarea != null ? !ticketarea.equals(ticket.ticketarea) : ticket.ticketarea != null) return false;
        if (ticketname != null ? !ticketname.equals(ticket.ticketname) : ticket.ticketname != null) return false;
        if (ticketprice != null ? !ticketprice.equals(ticket.ticketprice) : ticket.ticketprice != null) return false;
        if (taketime != null ? !taketime.equals(ticket.taketime) : ticket.taketime != null) return false;
        if (ticketimgsrc != null ? !ticketimgsrc.equals(ticket.ticketimgsrc) : ticket.ticketimgsrc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ticketid != null ? ticketid.hashCode() : 0;
        result = 31 * result + (ticketuser != null ? ticketuser.hashCode() : 0);
        result = 31 * result + (tickettime != null ? tickettime.hashCode() : 0);
        result = 31 * result + (ticketarea != null ? ticketarea.hashCode() : 0);
        result = 31 * result + (ticketname != null ? ticketname.hashCode() : 0);
        result = 31 * result + (ticketprice != null ? ticketprice.hashCode() : 0);
        result = 31 * result + (taketime != null ? taketime.hashCode() : 0);
        result = 31 * result + (ticketimgsrc != null ? ticketimgsrc.hashCode() : 0);
        return result;
    }
}
