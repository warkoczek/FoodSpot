package pl.warkoczewski.foodspot.setup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import pl.warkoczewski.foodspot.model.entity.Role;
import pl.warkoczewski.foodspot.model.entity.User;
import pl.warkoczewski.foodspot.repository.RoleRepository;
import pl.warkoczewski.foodspot.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Component
public class OnStartDataInitializer implements ApplicationRunner {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public OnStartDataInitializer(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public void run(ApplicationArguments args) {
        List<Role> roles = createRoles();
        log.info("After roles creation {}", roles);
        List<User> users = createUsers();
        log.info("After users creation {}", users);
    }
    private List<Role> createRoles(){
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("ROLE_USER"));
        roles.add(new Role("ROLE_ADMIN"));
        roles.add(new Role("ROLE_ADMIN_HEAD"));
        return roleRepository.saveAll(roles);
    }
    private List<User> createUsers() {
        List<User> users = new ArrayList<>();
        addAdminHead(users);
        addAdmin(users);
        addUser(users);
        return userRepository.saveAll(users);
    }

    private void addAdminHead(List<User> users) {
        User user = new User();
        user.setUsername("wojtek");
        user.setEmail("wojtek@yahoo.com");
        user.setPassword(passwordEncoder.encode("Wojteczek8("));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_ADMIN_HEAD"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_ADMIN"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_USER"));
        user.setEnabled(true);
        users.add(user);
    }
    private void addAdmin(List<User> users) {
        User user = new User();
        user.setUsername("warkocz");
        user.setEmail("awarkoczewski@yahoo.com");
        user.setPassword(passwordEncoder.encode("Joleczka8("));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_ADMIN"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_USER"));
        user.setEnabled(true);
        users.add(user);
    }
    private void addUser(List<User> users) {
        User user = new User();
        user.setUsername("markocz");
        user.setEmail("andresik82@gmail.com");
        user.setPassword(passwordEncoder.encode("Joleczka8&"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_USER"));
        user.setEnabled(true);
        users.add(user);
    }

}
