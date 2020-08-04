package ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticketsystem.model.Ticket;
import ticketsystem.service.TicketService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @PostMapping("getTicketuser")
    @ResponseBody
    public List<Ticket> getTicketHistory(@RequestBody Ticket ticket){
        return ticketService.getTicketuser(ticket.getTicketuser());
    }



    @PostMapping("saveTicket")
    public String saveTicket(@RequestBody Ticket ticket){
        return ticketService.saveTicket(ticket);
    }
}