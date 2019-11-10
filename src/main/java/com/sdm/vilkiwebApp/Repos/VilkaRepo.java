package com.sdm.vilkiwebApp.Repos;


import com.sdm.vilkiwebApp.Domain.Vilka;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

@org.springframework.stereotype.Repository
public interface VilkaRepo extends JpaRepository<Vilka, Long> {


    List<Vilka> findAll();
    List<Vilka> findAllByIncomeGreaterThan(Double percent);

    void deleteByIdIn(Collection<Long> Id);

}
