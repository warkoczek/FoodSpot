package pl.warkoczewski.foodspot.service.registration;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import pl.warkoczewski.foodspot.dto.RegistrationDataDTO;
import pl.warkoczewski.foodspot.model.entity.user.User;
import pl.warkoczewski.foodspot.repository.RoleRepository;
import pl.warkoczewski.foodspot.repository.UserRepository;
import pl.warkoczewski.foodspot.validation.groups.BusinessLogic;

import javax.validation.Valid;


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

    @Override @Validated({BusinessLogic.class})
    public void register(@Valid RegistrationDataDTO registrationDataDTO) {
        log.debug("Registration data to create user: {}", registrationDataDTO);
        User user = modelMapper.map(registrationDataDTO, User.class);
        log.debug("User after mapping: {}", user);
        user.setPassword(passwordEncoder.encode(registrationDataDTO.getPassword()));
        log.debug("User before saving: {}", user);
        userRepository.save(user);
        log.debug("User after saving: {}", user);
    }
}
