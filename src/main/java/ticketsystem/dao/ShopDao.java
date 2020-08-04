package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.Shop;

public interface ShopDao extends JpaRepository<Shop,String> {
}
