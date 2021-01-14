package pl.warkoczewski.foodspot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDataDTO {

    private String username;
    private String email;
    private String password;
    private String rePassword;

}
