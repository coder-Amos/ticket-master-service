package ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticketsystem.model.Musicparty;
import ticketsystem.service.MusicpartyService;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("musicparty")
public class MusicpartyController {
    @Autowired
    private MusicpartyService musicpartyService;
    @PostMapping("getMusicpartyList")
    @ResponseBody
    public List<Musicparty> getMusicparty(@RequestBody Musicparty musicparty){
        return musicpartyService.getMusicpartyList(musicparty.getKindid());
    }
}