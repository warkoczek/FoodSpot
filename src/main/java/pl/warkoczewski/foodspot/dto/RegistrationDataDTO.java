package pl.warkoczewski.foodspot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.warkoczewski.foodspot.validation.constraints.UniqueUsername;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDataDTO {
    @NotBlank@UniqueUsername(message = "Username already exists!")
    private String username;
    @Email@NotBlank
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String rePassword;

}
