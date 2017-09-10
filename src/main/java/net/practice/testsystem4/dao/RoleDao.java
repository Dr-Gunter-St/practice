package net.practice.testsystem4.dao;

import net.practice.testsystem4.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long>{

}
