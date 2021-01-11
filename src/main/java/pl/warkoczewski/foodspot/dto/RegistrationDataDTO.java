package pl.warkoczewski.foodspot.dto;

import lombok.Data;

@Data
public class RegistrationDataDTO {

    private String username;
    private String email;
    private String password;
    private String rePassword;

}
