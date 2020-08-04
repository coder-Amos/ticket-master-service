package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Drama;

import java.util.List;

public interface DramaDao extends JpaRepository<Drama,String> {
    List<Drama> findDramaByKindid(String kindid);
}