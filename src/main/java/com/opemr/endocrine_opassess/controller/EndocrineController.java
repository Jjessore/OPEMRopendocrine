package com.opemr.endocrine_opassess.controller;

import com.opemr.endocrine_opassess.entity.Endocrinedet;
import com.opemr.endocrine_opassess.entity.PKkey;
import com.opemr.endocrine_opassess.service.EndocrineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EndocrineController {

    @Autowired
    private EndocrineService endocrineService;
    @GetMapping({"/"})
    public String welcomeProc(){
        return "Welcome to Endocrine Assessment";
    }

    //@PostMapping("/newassessment")
    //public void createNewAssessment (@RequestBody Endocrinedet endocrinedet){
       // //endocrineService.createDet(endocrinedet);
       // System.out.println(endocrinedet);
    //}

    @PostMapping("/newassessment")
    public void createNewAssessment (@RequestBody Endocrinedet endocrinedet){
        System.out.println(endocrinedet.toString());
        endocrineService.createDet(endocrinedet);

    }

    @PostMapping("/getassessment")
    public void getNewAssessment (@RequestBody PKkey prmkey){
        endocrineService.getDet(prmkey);
    }

    @PostMapping("/checkAssessment")
    public void checkAssessment (@RequestBody PKkey prmkey){

    }


}


