package com.nkr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.nkr.entity.UserLogin;

@Repository
public interface LoginRepository extends CrudRepository<UserLogin, Integer> {

    UserLogin findByEmail(String email);

    UserLogin findByEmailAndPassword(String email, String password);
}
