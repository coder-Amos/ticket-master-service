package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Stage;

import java.util.List;

public interface StageDao extends JpaRepository<Stage,String> {
    List<Stage> findStageByKindid(String kindid);
}
