package ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticketsystem.model.Songs;
import ticketsystem.service.SongsService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("songs")
public class SongsController {
    @Autowired
    private SongsService songsService;
    @PostMapping("getSongsList")
    @ResponseBody
    public List<Songs> getSongs(@RequestBody Songs songs){
        return songsService.getSongsList(songs.getKindid());
    }
}
