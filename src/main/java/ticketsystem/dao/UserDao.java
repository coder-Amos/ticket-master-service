package ticketsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ticketsystem.model.User;

public interface UserDao extends JpaRepository<User,String> {
//    用户登录
User findByUsernameAndPassword(String userName,String passWord);



}
