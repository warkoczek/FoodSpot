package pl.warkoczewski.foodspot.service.role;

import pl.warkoczewski.foodspot.model.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();
    List<Role> addRoles();
}
