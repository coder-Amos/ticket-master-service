package ticketsystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ticketsystem.dao.UserDao;
import ticketsystem.model.User;

import java.util.List;
@Service
/**
 * 用户信息服务层
 */
public  class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 添加/ 编辑
     * @param user
     * @return
     */
    public String saveUser(User user){
      return userDao.save(user)!=null?"添加成功":"添加失败";
    }


    /**
     * 用户登录
     * @param userName
     * @param passWord
     * @return
     */
  public User userLogin(String userName,String passWord){
        return userDao.findByUsernameAndPassword(userName,passWord);
  }
    /*
    * **/
}