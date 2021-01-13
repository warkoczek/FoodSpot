package pl.warkoczewski.foodspot.service.registration;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.RegistrationDataDTO;
import pl.warkoczewski.foodspot.model.entity.Role;
import pl.warkoczewski.foodspot.model.entity.User;
import pl.warkoczewski.foodspot.repository.RoleRepository;
import pl.warkoczewski.foodspot.repository.UserRepository;

@Service
@Slf4j
public class RegistrationServiceImpl implements RegistrationService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public RegistrationServiceImpl(UserRepository userRepository, RoleRepository roleRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void register(RegistrationDataDTO registrationDataDTO) {
        log.debug("Registration data to create user: {}", registrationDataDTO);
        User user = modelMapper.map(registrationDataDTO, User.class);
        log.debug("User after mapping: {}", user);
        user.setActive(Boolean.TRUE);
        user.setPassword(passwordEncoder.encode(registrationDataDTO.getPassword()));
        user.getRoles().add(roleRepository.getRoleByName("ROLE_USER"));
        log.debug("User before saving: {}", user);
        userRepository.save(user);
        log.debug("User after saving: {}", user);
    }
}
