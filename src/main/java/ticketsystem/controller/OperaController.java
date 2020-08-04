package ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticketsystem.model.Opera;
import ticketsystem.service.OperaService;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("opera")
public class OperaController {
    @Autowired
    private OperaService operaService;
    @PostMapping("getOperaList")
    @ResponseBody
    public List<Opera> getOpera(@RequestBody Opera opera){
        return operaService.getOperaList(opera.getKindid());
    }
}
