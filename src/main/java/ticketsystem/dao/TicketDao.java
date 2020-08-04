package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Ticket;


import java.util.List;

public interface TicketDao extends JpaRepository<Ticket,String> {
    List<Ticket> findTicketByTicketuser(String ticketuser);
}
