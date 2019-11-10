package com.sdm.vilkiwebApp.Repos;


import com.sdm.vilkiwebApp.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);


}
