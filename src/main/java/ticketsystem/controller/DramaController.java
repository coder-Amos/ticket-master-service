package ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticketsystem.model.Drama;
import ticketsystem.service.DramaService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("drama")
public class DramaController {
    @Autowired
    private DramaService dramaService;
    @PostMapping("getDramaList")
    @ResponseBody
    public List<Drama> getDrama(@RequestBody Drama drama){
        return dramaService.getDramaList(drama.getKindid());
    }
}