package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Goodtype;

public interface GoodTypeDao extends JpaRepository<Goodtype,String> {
}
