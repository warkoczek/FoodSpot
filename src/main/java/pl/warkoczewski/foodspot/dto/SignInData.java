package pl.warkoczewski.foodspot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class SignInData {
    private String username;
    private String password;
}
