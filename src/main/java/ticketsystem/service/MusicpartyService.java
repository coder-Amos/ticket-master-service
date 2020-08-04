package ticketsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ticketsystem.dao.MusicpartyDao;
import ticketsystem.model.Musicparty;


import java.util.List;

@Service
public class MusicpartyService {
    @Autowired
    private MusicpartyDao musicpartyDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Musicparty> getMusicpartyList(String kindid){
        return musicpartyDao.findMusicpartyByKindid(kindid);
    }
}
