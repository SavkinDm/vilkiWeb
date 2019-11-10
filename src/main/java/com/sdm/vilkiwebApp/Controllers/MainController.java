package com.sdm.vilkiwebApp.Controllers;


import com.sdm.vilkiwebApp.Domain.Vilka;
import com.sdm.vilkiwebApp.Repos.VilkaRepo;
import com.sdm.vilkiwebApp.Service.VilkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {


    List<Vilka> vilkaList;

    @Autowired
    VilkaRepo vilkaRepo;

    @Autowired
    VilkaService vilkaService;

    @GetMapping("/")
    public String main(Map<String, Object> model) {

        vilkaList = vilkaService.getAllvilkas();

        model.put("list", vilkaList);
        model.put("kolvo", vilkaList.size());
        model.put("sorti", 0);
        return "main";
    }

    @GetMapping("/filter")
    public String filter(
            @RequestParam(required = false) Integer IncomePercent,
            @RequestParam(required = false) List<String> BK,
            Map<String, Object> model) {

        vilkaList = vilkaService.filter(BK, IncomePercent);
        model.put("list", vilkaList);
        model.put("kolvo", vilkaList.size());
        model.put("sorti", 0);


        return "main";
    }

    @GetMapping("/main/sort")
    public String sort(
            @RequestParam(required = false) Integer type,
            Map<String, Object> model) {

        switch (type) {
            case 1:
                vilkaList = vilkaService.sort(vilkaList, type);
                model.put("list", vilkaList);
                model.put("kolvo", vilkaList.size());
                model.put("sorti", 1);
                return "main";
            case -1:
                vilkaList = vilkaService.sort(vilkaList, type);
                model.put("list", vilkaList);
                model.put("kolvo", vilkaList.size());
                model.put("sorti", -1);
                return "main";
            default:
                model.put("list", vilkaList);
                model.put("kolvo", vilkaList.size());
                model.put("sorti", 0);
                return "main";
        }


    }


    @GetMapping("/aboutus")
    public String aboutus(Map<String, Object> model) {


        return "aboutus";
    }


}
