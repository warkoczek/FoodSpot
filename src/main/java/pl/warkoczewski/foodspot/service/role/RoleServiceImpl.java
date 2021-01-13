package pl.warkoczewski.foodspot.service.role;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.model.entity.Role;
import pl.warkoczewski.foodspot.repository.RoleRepository;

import java.util.Arrays;
import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    @Override
    @EventListener(ApplicationReadyEvent.class)
    public List<Role> addRoles() {
        return roleRepository.saveAll(Arrays.asList(new Role("ROLE_USER"), new Role("ROLE_ADMIN"), new Role("ROLE_RESTAURANT")));
    }
}
