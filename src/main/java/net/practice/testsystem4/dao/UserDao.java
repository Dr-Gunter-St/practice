package net.practice.testsystem4.dao;

import net.practice.testsystem4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
