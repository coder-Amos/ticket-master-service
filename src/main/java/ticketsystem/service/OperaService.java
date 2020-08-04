package ticketsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ticketsystem.dao.OperaDao;
import ticketsystem.model.Opera;


import java.util.List;

@Service
public class OperaService {
    @Autowired
    private OperaDao operaDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Opera> getOperaList(String kindid){
        return operaDao.findOperaByKindid(kindid);
    }
}
