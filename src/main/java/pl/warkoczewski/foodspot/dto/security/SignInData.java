package pl.warkoczewski.foodspot.dto.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class SignInData {
    private String username;
    private String password;
}
