package ticketsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticketsystem.model.Stage;
import ticketsystem.service.StageService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("stage")
public class StageController {
    @Autowired
    private StageService stageService;
    @PostMapping("getStageList")
    @ResponseBody
    public List<Stage> getStage(@RequestBody Stage stage){
        return stageService.getStageList(stage.getKindid());
    }
}