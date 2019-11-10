package com.sdm.vilkiwebApp.Repos;

import com.sdm.vilkiwebApp.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);


}
