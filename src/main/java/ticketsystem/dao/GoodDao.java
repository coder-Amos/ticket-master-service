package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Good;

import java.util.List;

public interface GoodDao extends JpaRepository<Good,String> {
    List<Good> findGoodsByGtid(String gtid);
}
