package ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticketsystem.model.Good;
import ticketsystem.service.GoodService;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodService goodService;


    @PostMapping("oneGood")
    @ResponseBody
    public List<Good> getOneGoods(@RequestBody Good good){
        return  goodService.getGoodsList(good.getGtid());
    }


}
