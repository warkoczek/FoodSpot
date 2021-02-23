package pl.warkoczewski.foodspot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.warkoczewski.foodspot.model.entity.user.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getRoleByName(String name);
    //@Query("SELECT u.username, r.name FROM users u JOIN users_roles ur ON u.id = ur.user_id JOIN roles r ON ur.roles_id = r.id WHERE u.username = :username")
    //List<Role> getRolesByUsername(@Param("username") String username);
}
