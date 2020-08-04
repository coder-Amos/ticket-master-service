package ticketsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ticketsystem.dao.SongsDao;
import ticketsystem.model.Songs;

import java.util.List;

@Service
public class SongsService {
    @Autowired
    private SongsDao songsDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Songs> getSongsList(String kindid){
        return songsDao.findSongsByKindid(kindid);
    }
}
