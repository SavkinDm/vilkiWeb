package com.sdm.vilkiwebApp.Service;


import com.sdm.vilkiwebApp.Domain.Vilka;
import com.sdm.vilkiwebApp.Repos.VilkaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class DBclearingService {

    @Autowired
    VilkaRepo vilkaRepo;

    @Scheduled(fixedDelay = 18_000_000)
    @Transactional
    public void clearOldVilki() {
        List<Vilka> allVilki = vilkaRepo.findAll();
        List<Long> idsToDelete = new ArrayList<>();
        for (Vilka vilka : allVilki) {
            long curTime = System.currentTimeMillis() / 1000;
            if (vilka.getStartTime() + 6000 < curTime) {
                idsToDelete.add(vilka.getId());
            }
        }
        vilkaRepo.deleteByIdIn(idsToDelete);
        System.out.println("old vilki were deleted");
    }
}
