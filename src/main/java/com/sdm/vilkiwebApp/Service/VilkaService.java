package com.sdm.vilkiwebApp.Service;


import com.sdm.vilkiwebApp.Domain.Vilka;
import com.sdm.vilkiwebApp.Repos.VilkaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class VilkaService {
    @Autowired
    VilkaRepo vilkaRepo;


    public List<Vilka> getAllvilkas() {
        return (List<Vilka>) vilkaRepo.findAll();
    }


    public List<Vilka> filter(List<String> BK, Integer IncomePercent) {
        if (BK != null && IncomePercent != null) {
            return BKandIncomefilter(BK, IncomePercent, 1);
        }
        if (BK != null && IncomePercent == null) {
            return BKandIncomefilter(BK, IncomePercent, 2);
        }
        if (BK == null && IncomePercent != null) {
            return vilkaRepo.findAllByIncomeGreaterThan(Double.valueOf(IncomePercent));
        }
        if (BK == null && IncomePercent == null) {
            return vilkaRepo.findAll();
        }

        return new ArrayList<>();
    }


    private List<Vilka> BKandIncomefilter(List<String> BK, Integer IncomePercent, int i) {
        List<Vilka> vilkaList = vilkaRepo.findAll();
        List<Vilka> vilkaListItog = new ArrayList<>();
        switch (i) {
            case 1:
                for (Vilka vilka : vilkaList) {
                    if (vilka.getIncome() >= IncomePercent && (BK.contains(vilka.getBkName1()) || BK.contains(vilka.getBkName2()))) {
                        vilkaListItog.add(vilka);
                    }
                }
                break;
            case 2:
                for (Vilka vilka : vilkaList) {
                    if ((BK.contains(vilka.getBkName1()) || BK.contains(vilka.getBkName2()))) {
                        vilkaListItog.add(vilka);
                    }
                }
                break;

        }


        return vilkaListItog;
    }

    public List<Vilka> sort(List<Vilka> vilkaList, Integer type) {
        if (vilkaList == null) {
            vilkaList = vilkaRepo.findAll();
        }
        if (type != null) {
            Collections.sort(vilkaList, new Comparator<Vilka>() {
                @Override
                public int compare(Vilka o1, Vilka o2) {
                    if (o1.getIncome() > o2.getIncome())
                        return 1;
                    else
                        return -1;
                }
            });
            switch (type) {
                case 1:
                    return vilkaList;
                case -1:
                    Collections.reverse(vilkaList);
                    return vilkaList;


            }
        }
        return vilkaList;
    }
}
