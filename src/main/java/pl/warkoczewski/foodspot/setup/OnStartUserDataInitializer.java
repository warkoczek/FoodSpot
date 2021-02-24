package pl.warkoczewski.foodspot.setup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import pl.warkoczewski.foodspot.model.entity.restaurant.Restaurant;
import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;
import pl.warkoczewski.foodspot.model.entity.user.Role;
import pl.warkoczewski.foodspot.model.entity.user.User;
import pl.warkoczewski.foodspot.model.enums.SEAT_NAME;
import pl.warkoczewski.foodspot.repository.RestaurantRepository;
import pl.warkoczewski.foodspot.repository.RoleRepository;
import pl.warkoczewski.foodspot.repository.SeatRepository;
import pl.warkoczewski.foodspot.repository.UserRepository;

import java.util.*;

@Slf4j
@Component
public class OnStartUserDataInitializer implements ApplicationRunner {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final RestaurantRepository restaurantRepository;
    private final SeatRepository seatRepository;
    private final PasswordEncoder passwordEncoder;

    public OnStartUserDataInitializer(UserRepository userRepository, RoleRepository roleRepository
            , RestaurantRepository restaurantRepository
            , SeatRepository seatRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.restaurantRepository = restaurantRepository;
        this.seatRepository = seatRepository;
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
        roles.add(new Role("ROLE_ADMIN_HEAD"));
        roles.add(new Role("ROLE_ADMIN"));
        roles.add(new Role("ROLE_MANAGER"));
        roles.add(new Role("ROLE_USER"));

        return roleRepository.saveAll(roles);
    }
    private List<User> createUsers() {
        List<User> users = new ArrayList<>();
        addAdminHead(users);
        addAdmin(users);
        addUser(users);
        addManager(users);
        return userRepository.saveAll(users);
    }
    private void addAdminHead(List<User> users) {
        User user = new User();
        user.setUsername("head");
        user.setEmail("wojtek@yahoo.com");
        user.setPassword(passwordEncoder.encode("Head123!"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_ADMIN_HEAD"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_ADMIN"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_USER"));
        user.setEnabled(true);
        users.add(user);
    }
    private void addAdmin(List<User> users) {
        User user = new User();
        user.setUsername("admin");
        user.setEmail("awarkoczewski@yahoo.com");
        user.setPassword(passwordEncoder.encode("Admin123!"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_ADMIN"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_USER"));
        user.setEnabled(true);
        users.add(user);
    }
    private void addManager(List<User> users) {
        User user = new User();
        user.setUsername("manager");
        user.setEmail("tortilla82@gmail.com");
        user.setPassword(passwordEncoder.encode("Manager123!"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_MANAGER"));
        user.setEnabled(true);
        users.add(user);
    }
    private void addUser(List<User> users) {
        User user = new User();
        user.setUsername("user");
        user.setEmail("andresik82@gmail.com");
        user.setPassword(passwordEncoder.encode("User123!"));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_USER"));
        user.setEnabled(true);
        users.add(user);
    }


}
