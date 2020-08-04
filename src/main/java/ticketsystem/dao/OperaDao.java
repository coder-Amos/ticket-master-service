package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Opera;

import java.util.List;

public interface OperaDao extends JpaRepository<Opera,String> {
    List<Opera> findOperaByKindid(String kindid);
}
