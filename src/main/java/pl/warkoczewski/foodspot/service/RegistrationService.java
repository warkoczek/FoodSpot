package pl.warkoczewski.foodspot.service;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.RegistrationDataDTO;


public interface RegistrationService {
    public void register(RegistrationDataDTO registrationDataDTO);
}
