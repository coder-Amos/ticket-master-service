package ticketsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticketsystem.dao.AddressDao;
import ticketsystem.model.Addresses;

import java.util.List;

/**
 * 地址管理
 */
@Service
public class AddressService {

    @Autowired
    private AddressDao addressDao;


    /**
     * 添加  修改
     * @param addresses
     * @return
     */
    public String saveAddress(Addresses addresses){
        return addressDao.save(addresses)!=null?"添加成功":"添加失败";
    }

    /**
     * 根据id查询一条记录
     * @param id
     * @return
     */
    public Addresses findById(String id){
        return addressDao.findById(id).orElse(null);
    }


    /**
     * 根据用户id查询该用户的地址
     * @param userid
     * @return
     */
    public List<Addresses> fndAddressList(String userid){
        return addressDao.findAllByUserid(userid);
    }
}
