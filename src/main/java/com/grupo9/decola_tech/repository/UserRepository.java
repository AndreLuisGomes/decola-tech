package com.grupo9.decola_tech.repository;

import com.grupo9.decola_tech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT e FROM User e JOIN FETCH e.roless WHERE e.username= (:username")
    public User findByUsername(@Param("username") String username);

    boolean existsByUsername(String username);
}
