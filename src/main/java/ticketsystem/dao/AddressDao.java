package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Addresses;

import java.util.List;

public interface AddressDao extends JpaRepository<Addresses,String>{
    List<Addresses> findAllByUserid(String userid);
}
