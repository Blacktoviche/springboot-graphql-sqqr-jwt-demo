package org.prime.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

import org.prime.graphql.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
    Optional<User> findByUsername(String username);
    
    public List<User> findByEnabledTrue();
    
    @Query("select u from User u where u.username like :username and u.id != :userId ")
    Optional<User> findByUsernameExept(String username, Long userId);
    
}
