package com.sdm.vilkiwebApp.Repos;


import com.sdm.vilkiwebApp.Domain.Vilka;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface VilkaRepo extends Repository<Vilka, Long> {


    List<Vilka> findAll();

    List<Vilka> findAllByIncomeGreaterThan(Double percent);


}
