package pl.warkoczewski.foodspot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.warkoczewski.foodspot.model.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
        Role getRoleByName(String name);
}
