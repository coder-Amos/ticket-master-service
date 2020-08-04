package ticketsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ticketsystem.dao.TicketDao;
import ticketsystem.model.Ticket;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketDao ticketDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Ticket> getTicketuser(String ticketuser){
        return ticketDao.findTicketByTicketuser(ticketuser);
    }

    /**
     * 添加/ 编辑
     * @param
     * @return
     */
    public String saveTicket(Ticket ticket){
        return ticketDao.save(ticket)!=null?"添加成功":"添加失败";
    }
}
