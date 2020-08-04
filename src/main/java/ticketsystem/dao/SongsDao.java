package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Songs;

import java.util.List;

public interface SongsDao extends JpaRepository<Songs,String> {
    List<Songs> findSongsByKindid(String kindid);
}
