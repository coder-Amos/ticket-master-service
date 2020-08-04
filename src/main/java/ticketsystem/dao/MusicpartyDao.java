package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Musicparty;

import java.util.List;

public interface MusicpartyDao extends JpaRepository<Musicparty,String> {
    List<Musicparty> findMusicpartyByKindid(String kindid);
}