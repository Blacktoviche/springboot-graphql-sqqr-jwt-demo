package org.prime.graphql.repository;

import org.prime.graphql.model.Role;
import org.prime.graphql.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	@Query("select r from Role r where r.name like :roleName")
    Role findByRoleName(RoleName roleName);

}
