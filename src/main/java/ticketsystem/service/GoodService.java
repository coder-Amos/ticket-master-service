package ticketsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ticketsystem.dao.GoodDao;
import ticketsystem.model.Good;

import java.util.List;


@Service
public class GoodService {
    @Autowired
    private GoodDao goodDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Good> getGoodsList(String gtid){
        return goodDao.findGoodsByGtid(gtid);
    }
}
