package ticketsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ticketsystem.dao.DramaDao;
import ticketsystem.model.Drama;


import java.util.List;

@Service
public class DramaService {
    @Autowired
    private DramaDao dramaDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Drama> getDramaList(String kindid){
        return dramaDao.findDramaByKindid(kindid);
    }
}
