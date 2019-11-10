package com.sdm.vilkiwebApp.Service;


import com.sdm.vilkiwebApp.Domain.User;
import com.sdm.vilkiwebApp.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userRepo.findByUsername(s);
    }


    public boolean auth(String login, String apikey) {

        User user = userRepo.findByUsername(login);
        if (new BCryptPasswordEncoder().matches(apikey, user.getPassword()))
            return true;
        else
            return false;

    }
}
