package ticketsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ticketsystem.dao.StageDao;
import ticketsystem.model.Stage;


import java.util.List;

@Service
public class StageService {
    @Autowired
    private StageDao stageDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Stage> getStageList(String kindid){
        return stageDao.findStageByKindid(kindid);
    }
}
