package pl.warkoczewski.foodspot.service;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.RegistrationDataDTO;
import pl.warkoczewski.foodspot.repository.UserRepository;
@Service
public class RegistrationServiceImpl implements RegistrationService {
    private final UserRepository userRepository;

    public RegistrationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void register(RegistrationDataDTO registrationDataDTO) {

    }
}
